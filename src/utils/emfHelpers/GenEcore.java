package utils.emfHelpers;

import java.util.Collections;
import java.util.Map;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.Path;
import org.eclipse.emf.codegen.ecore.generator.Generator;
import org.eclipse.emf.codegen.ecore.generator.GeneratorAdapterFactory;
import org.eclipse.emf.codegen.ecore.genmodel.GenModel;
import org.eclipse.emf.codegen.ecore.genmodel.GenModelFactory;
import org.eclipse.emf.codegen.ecore.genmodel.GenModelPackage;
import org.eclipse.emf.codegen.ecore.genmodel.GenPackage;
import org.eclipse.emf.codegen.ecore.genmodel.generator.GenBaseGeneratorAdapter;
import org.eclipse.emf.codegen.ecore.genmodel.generator.GenModelGeneratorAdapterFactory;
import org.eclipse.emf.common.util.BasicMonitor;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.EcoreResourceFactoryImpl;

public class GenEcore {

	public GenModel ecore2genmodel(String ecoreFilePath, String projectPath, String prefix){
		EcorePlugin.getPlatformResourceMap().put("project", URI.createURI("file:"+projectPath));		
		Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap( ).put
		("*",new EcoreResourceFactoryImpl() ); 
		 IPath ecorePath = new Path(ecoreFilePath);
         ResourceSet resourceSet = new ResourceSetImpl();
         resourceSet.getURIConverter().getURIMap().putAll(EcorePlugin.computePlatformURIMap()); 
         URI ecoreURI = URI.createFileURI(ecorePath.toString());
         resourceSet.getResourceFactoryRegistry();
         Resource resource =resourceSet.getResource(ecoreURI, true);
         EPackage ePackage = (EPackage)resource.getContents().get(0);
         IPath genModelPath = ecorePath.removeFileExtension().addFileExtension("genmodel");
         URI genModelURI = URI.createFileURI(genModelPath.toString());
         Resource genModelResource = 
         Resource.Factory.Registry.INSTANCE.getFactory(genModelURI).createResource(genModelURI);
         GenModel genModel = GenModelFactory.eINSTANCE.createGenModel();
         genModelResource.getContents().add(genModel);
         resourceSet.getResources().add(genModelResource);
         Map<String, URI> map = EcorePlugin.getPlatformResourceMap();
         
         map.put("gen", URI.createFileURI(projectPath+"genEcore/src"));
         EcorePlugin.resolvePlatformResourcePath(projectPath+"genEcore/src");
         genModel.setModelDirectory("/project/src");
         genModel.getForeignModel().add(ecorePath.toString());
         genModel.initialize(Collections.singleton(ePackage));
         GenPackage genPackage = genModel.getGenPackages().get(0);
         genModel.setModelName(genModelURI.trimFileExtension().lastSegment());
         genPackage.setPrefix(prefix);
         genModel.setCanGenerate(true);
         for(GenPackage g : genModel.getGenPackages())
         {	g.setPrefix(prefix);}
         return genModel;
	}
	
	public GenEcore(String ecoreFilePath, String projectPath, String prefix){		
		  GeneratorAdapterFactory.Descriptor.Registry.INSTANCE.addDescriptor
		     (GenModelPackage.eNS_URI,GenModelGeneratorAdapterFactory.DESCRIPTOR);	
		   Generator generator = new Generator();		   
		   generator.setInput(ecore2genmodel(ecoreFilePath,projectPath,prefix));
		   System.out.println("can generate : "+generator.canGenerate(ecore2genmodel(ecoreFilePath,projectPath,prefix), GenBaseGeneratorAdapter.MODEL_PROJECT_TYPE));
		   generator.generate(ecore2genmodel(ecoreFilePath,projectPath,prefix), GenBaseGeneratorAdapter.MODEL_PROJECT_TYPE,
		      new BasicMonitor.Printing(System.out));		  
	}
	
	public static void main(String[] args){
		System.out.println("start");
		GenEcore g = new GenEcore("/home/obendavi/Bureau/coding/workspaceSPECIAL/tooling/metamodels/policy/policy.ecore","/home/obendavi/Bureau/coding/workspaceSPECIAL/tooling/","Policy");
		System.out.println("end");
	}
	
}