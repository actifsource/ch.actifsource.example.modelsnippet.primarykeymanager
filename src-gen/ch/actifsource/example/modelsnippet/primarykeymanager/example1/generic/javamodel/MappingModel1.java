package ch.actifsource.example.modelsnippet.primarykeymanager.example1.generic.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class MappingModel1 extends DynamicResource implements IMappingModel1 {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<IMappingModel1> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<IMappingModel1>() {
    
    @Override
    public IMappingModel1 create() {
      return new MappingModel1();
    }
    
    @Override
    public IMappingModel1 create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new MappingModel1(resourceRepository, resource);
    }
  
  };

  public MappingModel1() {
    super(IMappingModel1.TYPE_ID);
  }
  
  public MappingModel1(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, IMappingModel1.TYPE_ID);
  }

  // attributes
  
  @Override
  public java.lang.String selectName() {
    return _getSingleAttribute(java.lang.String.class, ch.actifsource.core.CorePackage.NamedResource_name);
  }
    
  public void setName(java.lang.String name) {
     _setSingleAttribute(ch.actifsource.core.CorePackage.NamedResource_name, name);
  }

  // relations
  
  @Override
  public java.util.List<? extends ch.actifsource.example.modelsnippet.primarykeymanager.example1.generic.javamodel.IMappingResource1> selectMappingResource() {
    return _getList(ch.actifsource.example.modelsnippet.primarykeymanager.example1.generic.javamodel.IMappingResource1.class, ch.actifsource.example.modelsnippet.primarykeymanager.example1.generic.GenericPackage.MappingModel1_mappingResource);
  }

  public MappingModel1 setMappingResource(java.util.List<? extends ch.actifsource.example.modelsnippet.primarykeymanager.example1.generic.javamodel.IMappingResource1> mappingResource) {
    _setList(ch.actifsource.example.modelsnippet.primarykeymanager.example1.generic.GenericPackage.MappingModel1_mappingResource, mappingResource);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public MappingModel1 setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // attributes
    _acceptSingleAttribute(java.lang.String.class, ch.actifsource.core.CorePackage.NamedResource_name, visitor);
    // relations
    _acceptList(ch.actifsource.example.modelsnippet.primarykeymanager.example1.generic.javamodel.IMappingResource1.class, ch.actifsource.example.modelsnippet.primarykeymanager.example1.generic.GenericPackage.MappingModel1_mappingResource, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

  // toMeRelations
  
  public static ch.actifsource.example.modelsnippet.primarykeymanager.example1.generic.javamodel.IMappingModel1 selectToMeMappingResource(ch.actifsource.example.modelsnippet.primarykeymanager.example1.generic.javamodel.IMappingResource1 object) {
    return _getToMeSingle(object.getRepository(), ch.actifsource.example.modelsnippet.primarykeymanager.example1.generic.javamodel.IMappingModel1.class, ch.actifsource.example.modelsnippet.primarykeymanager.example1.generic.GenericPackage.MappingModel1_mappingResource, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,7d354399-98d5-11ea-8ef1-cb1cd2be9da3,v9Yps74YRjr3S6vpSA3ye06wgV0=] */
