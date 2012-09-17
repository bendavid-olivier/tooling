package utils.editorGenerator;

import java.io.File;


import javaz.*;

public class Javaz2Files {
	
	private Javaz javaz;
	
	public Javaz2Files(Javaz j){
		javaz = j;
	}
	
	public void transformation(){
		transformPackages();
		transformClass();	
	}
	
	public void transformPackages(){
		for(JavaPackageX s : javaz.getPackages()){
			if(s.isNeedToGenerate()){
				String packName = s.getName().replace(".","/");
				File f = new File("src/"+packName);
				f.mkdirs();
			}
		}	
	}
		
	public void transformClass(){
		for(JavaClass jc : javaz.getClasses()){
			String content = "package "+jc.getPackage().getName() +";\n";
			for(JavaClass i : jc.getImports()){
				content = content +"import "+i.getPackage().getName() +"."+i.getName()+";"+"\n";
			}
			if(jc.isPublic()){
				content = content + "public ";
			}
			if(jc.isFinal() ){
				content = content + "final ";
			}
			content = content + jc.getKind() +" "+ jc.getName();
			
			if(jc.getExtends() != null){
				content = content +" extends ";
				content = content + jc.getExtends().getName();
			}
			
			if(jc.getImplements().size() > 0){
				content = content +" implements ";
				int cpt = jc.getImplements().size() -1;
				for(JavaClass cc : jc.getImplements()){
					content = content + cc.getName();
					if(cpt >0){
						content = content +",";
						cpt = cpt -1;
					}
				}
			}
			
			content = content + "{\n";
			
			for(Field f : jc.getFields()){
				content = content +"  "+ f.getVisibility() +" "+ f.getType()+" "+ f.getName() + ";\n";
			}
			
			
			
			for(Method m : jc.getMethods()){
				//case a constructor
				if (m.isConstructor()){
					content = content +"  "+m.getVisibility() +" ";
					String typeOut =null;
					for(JavaParameter jp : m.getParameters()){
						if(jp.getKind().equals(JavaParameterKind.OUT)){
							typeOut = jp.getType();
						}
					}
					content = content +m.getName() +"(";
					int cpt = 0;
					for(JavaParameter jp : m.getParameters()){
						if(jp.getKind().equals(JavaParameterKind.IN)){
							cpt  =cpt +1;
						}
					}
					cpt = cpt -1;
					for(JavaParameter jp : m.getParameters()){
						if(jp.getKind().equals(JavaParameterKind.IN)){
							content = content +jp.getType()+" "+jp.getName()+" ";
							if(cpt >0){
								content = content +",";
								cpt = cpt -1;
							}
							
						}
					}
					content = content +"){\n";
					content = content + m.getBlock().getContent()+"\n";
					content = content +"  }\n";
				}
				//case a method 
				else{
					if(jc.getKind().equals(JavaKind.CLASS)){
						content = content +"  "+m.getVisibility() +" ";
						if(m.isStatic()){
							content = content +"static  ";
						}
						
						String typeOut =null;
						for(JavaParameter jp : m.getParameters()){
							if(jp.getKind().equals(JavaParameterKind.OUT)){
								typeOut = jp.getType();
							}
						}
						if (typeOut==null){
							content = content +"void" +" ";
						}
						else{
							content = content +typeOut +" ";
						}
						content = content +m.getName() +"(";
						int cpt = 0;
						for(JavaParameter jp : m.getParameters()){
							if(jp.getKind().equals(JavaParameterKind.IN)){
								cpt  =cpt +1;
							}
						}
						cpt = cpt -1;
						for(JavaParameter jp : m.getParameters()){
							if(jp.getKind().equals(JavaParameterKind.IN)){
								content = content +jp.getType()+" "+jp.getName()+" ";
								if(cpt >0){
									content = content +",";
									cpt = cpt -1;
								}
								
							}
						}
						content = content +"){\n";
						System.out.println(jc.getName()+" "+m.getName());
						content = content + m.getBlock().getContent()+"\n";
						content = content +"  }\n";
					}
					else if(jc.getKind().equals(JavaKind.INTERFACE)){
						System.out.println(m.getName());
						content = content +"  "+m.getVisibility() +" ";
						String typeOut =null;
						for(JavaParameter jp : m.getParameters()){
							if(jp.getKind().equals(JavaParameterKind.OUT)){
								typeOut = jp.getType();
							}
						}
						if (typeOut==null){
							content = content +"void" +" ";
						}
						else{
							content = content +typeOut +" ";
						}
						content = content +m.getName() +"(";
						int cpt = 0;
						for(JavaParameter jp : m.getParameters()){
							if(jp.getKind().equals(JavaParameterKind.IN)){
								cpt  =cpt +1;
							}
						}
						cpt = cpt -1;
						for(JavaParameter jp : m.getParameters()){
							if(jp.getKind().equals(JavaParameterKind.IN)){
								content = content +jp.getType()+" "+jp.getName()+" ";
								if(cpt >0){
									content = content +",";
									cpt = cpt -1;
								}
								
							}
						}
						content = content +");\n";
					}
				}
			}
				
			content = content + "}";
			FileGenerator fg = new FileGenerator();
			String path = "src/"+jc.getPackage().getName().replace(".", "/") +"/"+jc.getName()+".java";
			File f = new File(path);
			System.out.println(f.getAbsolutePath());
			
			if(jc.isNeedToGenerate()){
				if(jc.isRewritable()){
					fg.writeFile(f, content);
				}
				else{
					fg.writeFileIfNotExist(f, content);
				}
			}
		}
	}
	
	public static void main(String[] args){
		JavazFactory factory = JavazFactory.eINSTANCE;
		
		Javaz java = factory.createJavaz();
		
		JavaPackageX pack = factory.createJavaPackageX();
		pack.setName("test");
		
		
		JavaClass test = factory.createJavaClass();
		test.setName("Test");
		test.setPublic(true);
		test.setPackage(pack);
		
		Field f = factory.createField();
		f.setVisibility(JavaVisibilityKind.PRIVATE);
		f.setName("bibi");
		f.setType("String");
		test.getFields().add(f);
		
		Method m = factory.createMethod();
		m.setVisibility(JavaVisibilityKind.PUBLIC);
		m.setName("Test");
		m.setConstructor(true);
		test.getMethods().add(m);
		
		Block b = factory.createBlock();
		b.setContent("    System.out.println(bibi);");
		m.setBlock(b);
		
		java.getPackages().add(pack);
		java.getClasses().add(test);
		
		Javaz2Files j2f = new Javaz2Files(java);
		j2f.transformation();
	}
	

}
