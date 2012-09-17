package javazTools.transformations;
import javazTools.editor.JavazEditor;
import javaz.*;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;
import java.lang.reflect.Method;
import java.lang.reflect.InvocationTargetException;
public class JavazScript2Javaz{
  public String script;
  public ArrayList<String> primitives;
  public JavazScript2Javaz(String txt ){
script = txt.replaceAll("\n", " ");
script = script.substring(script.indexOf("JavazScript{") + 11+1,script.indexOf("}"));
script = script.replace(" ", "");
primitives = new ArrayList<String>();
initPrimitives();

  }
  public void initPrimitives(){
for (Method m : JavazEditor.class.getMethods()){
primitives.add(m.getName());
}

  }
  public Javaz transformation(){
    Javaz javaz= JavazFactory.eINSTANCE.createJavaz();
    javazTools.editor.JavazEditor javazEditor = new javazTools.editor.JavazEditor(javaz);
	 parseExpressions(javazEditor);
	return javaz;

  }
  public void transformation(Javaz javaz ){
    javazTools.editor.JavazEditor javazEditor = new javazTools.editor.JavazEditor(javaz);
	 parseExpressions(javazEditor);

  }
  public void parseExpressions(javazTools.editor.JavazEditor javazEditor ){
for (String expr : script.split(";")) {
String exprPrim = expr.substring(0,expr.indexOf("("));
for (String prim : primitives) {
if (exprPrim.equals(prim)) {
triggerMethod(javazEditor, parseExpressionArguments(expr) ,prim);
}
}
}

  }
  public java.lang.Object[] parseExpressionArguments(String expr ){
String txt = expr.substring(expr.indexOf("(") + 1, expr.indexOf(")"));
java.lang.Object[] args = new java.lang.Object[txt.split(",").length];
int cpt = 0;
for (String arg : txt.split(",")) {
args[cpt] = arg;
cpt=cpt+1;
}
return args;

  }
  public void triggerMethod(java.lang.Object o ,java.lang.Object[] args ,String nomMethode ){
Class[] paramTypes = null;
if (args != null) {
		paramTypes = new Class[args.length];
		for (int i = 0; i < args.length; i++) {
			boolean isInt = true;
			for(char c : args[i].toString().toCharArray()){
				if (!((c =='0')||(c =='1')||(c =='2')||(c =='3')||(c =='4')||(c =='5')||(c =='6')||(c =='7')||(c =='8')||(c =='9'))){
					isInt = false;
				}
			}
			if(isInt){
				paramTypes[i] = int.class;
				int arg = Integer.parseInt((String) args[i]);
				args[i] = arg;
			}
			else if(args[i].toString().equals("true")){
				paramTypes[i] = boolean.class;
				boolean arg = true;
				args[i] = arg;
			}
			else if(args[i].toString().equals("false")){
				paramTypes[i] = boolean.class;
				boolean arg = false;
				args[i] = arg;
			}
			else{
			paramTypes[i] = args[i].getClass();
			}
		}
	}
Method m = null;
try {
m = o.getClass().getMethod(nomMethode, paramTypes);
m.setAccessible(true);
m.invoke(o, args);
} catch (SecurityException e) {
// TODO Auto-generated catch block
e.printStackTrace();
} catch (NoSuchMethodException e) {
// TODO Auto-generated catch block
e.printStackTrace();
} catch (IllegalArgumentException e) {
// TODO Auto-generated catch block
e.printStackTrace();
} catch (IllegalAccessException e) {
// TODO Auto-generated catch block
e.printStackTrace();
} catch (InvocationTargetException e) {
// TODO Auto-generated catch block
e.printStackTrace();
}

  }
}