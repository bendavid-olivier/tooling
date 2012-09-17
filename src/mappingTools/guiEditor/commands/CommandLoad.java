package mappingTools.guiEditor.commands;
import mappingTools.guiEditor.graphicComponents.MappingTextualEditor;
import mappingTools.guiEditor.graphicComponents.FileChoser;
import mapping.*;
import java.io.IOException;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import javax.swing.Action;
public class CommandLoad extends Command implements Action{
  public CommandLoad(MappingTextualEditor e ,String nme ,String desc ){
		super(e, nme, desc);

  }
  public void execute(){
	ResourceSet resourceSetMetamodel;
	Resource resourceModel;
	// REGISTER THE METAMODEL
	resourceSetMetamodel = new ResourceSetImpl();
	resourceSetMetamodel.getPackageRegistry().put(MappingPackage.eNS_URI,
	MappingPackage.eINSTANCE);
	resourceSetMetamodel.getResourceFactoryRegistry()
	.getExtensionToFactoryMap()
	.put("xmi", new XMIResourceFactoryImpl());
	FileChoser fc = new FileChoser(editor);
	System.out.println(fc.getChooser().getSelectedFile().getAbsolutePath());
	String path = fc.getChooser().getSelectedFile().getAbsolutePath();
	// LOAD THE MODEL
	resourceModel = resourceSetMetamodel.createResource(URI
	.createFileURI(path));
	try {
	resourceModel.load(null);
	} catch (IOException e) {
	System.out.println("error during the model loading step");
	e.printStackTrace();
	}
	// INSTANTIATE ROOTELEMENT WITH THE CONTAINERROOT OF THE LOADED MODEL
	editor.setMapping((Mapping) resourceModel.getContents().get(0));
	// getEditor().graphMonitorPolicy.update();

  }
}