package ch.actifsource.example.modelsnippet.primarykeymanager.example2.generic.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class MappingModel2 extends DynamicResource implements IMappingModel2 {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<IMappingModel2> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<IMappingModel2>() {
    
    @Override
    public IMappingModel2 create() {
      return new MappingModel2();
    }
    
    @Override
    public IMappingModel2 create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new MappingModel2(resourceRepository, resource);
    }
  
  };

  public MappingModel2() {
    super(IMappingModel2.TYPE_ID);
  }
  
  public MappingModel2(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, IMappingModel2.TYPE_ID);
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
  public java.util.List<? extends ch.actifsource.example.modelsnippet.primarykeymanager.example2.generic.javamodel.IMappingResource2> selectMappingResource() {
    return _getList(ch.actifsource.example.modelsnippet.primarykeymanager.example2.generic.javamodel.IMappingResource2.class, ch.actifsource.example.modelsnippet.primarykeymanager.example2.generic.GenericPackage.MappingModel2_mappingResource);
  }

  public MappingModel2 setMappingResource(java.util.List<? extends ch.actifsource.example.modelsnippet.primarykeymanager.example2.generic.javamodel.IMappingResource2> mappingResource) {
    _setList(ch.actifsource.example.modelsnippet.primarykeymanager.example2.generic.GenericPackage.MappingModel2_mappingResource, mappingResource);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public MappingModel2 setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // attributes
    _acceptSingleAttribute(java.lang.String.class, ch.actifsource.core.CorePackage.NamedResource_name, visitor);
    // relations
    _acceptList(ch.actifsource.example.modelsnippet.primarykeymanager.example2.generic.javamodel.IMappingResource2.class, ch.actifsource.example.modelsnippet.primarykeymanager.example2.generic.GenericPackage.MappingModel2_mappingResource, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

  // toMeRelations
  
  public static ch.actifsource.example.modelsnippet.primarykeymanager.example2.generic.javamodel.IMappingModel2 selectToMeMappingResource(ch.actifsource.example.modelsnippet.primarykeymanager.example2.generic.javamodel.IMappingResource2 object) {
    return _getToMeSingle(object.getRepository(), ch.actifsource.example.modelsnippet.primarykeymanager.example2.generic.javamodel.IMappingModel2.class, ch.actifsource.example.modelsnippet.primarykeymanager.example2.generic.GenericPackage.MappingModel2_mappingResource, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,f5be3f25-bec6-11eb-a569-918f3c9a692e,mrLXmfxEIs1jJcCPLwAXNTUIb18=] */
