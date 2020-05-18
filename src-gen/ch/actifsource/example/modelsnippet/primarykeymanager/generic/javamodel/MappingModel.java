package ch.actifsource.example.modelsnippet.primarykeymanager.generic.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class MappingModel extends DynamicResource implements IMappingModel {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<IMappingModel> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<IMappingModel>() {
    
    @Override
    public IMappingModel create() {
      return new MappingModel();
    }
    
    @Override
    public IMappingModel create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new MappingModel(resourceRepository, resource);
    }
  
  };

  public MappingModel() {
    super(IMappingModel.TYPE_ID);
  }
  
  public MappingModel(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, IMappingModel.TYPE_ID);
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
  public java.util.List<? extends ch.actifsource.example.modelsnippet.primarykeymanager.generic.javamodel.IMappingResource> selectMappingResource() {
    return _getList(ch.actifsource.example.modelsnippet.primarykeymanager.generic.javamodel.IMappingResource.class, ch.actifsource.example.modelsnippet.primarykeymanager.generic.GenericPackage.MappingModel_mappingResource);
  }

  public MappingModel setMappingResource(java.util.List<? extends ch.actifsource.example.modelsnippet.primarykeymanager.generic.javamodel.IMappingResource> mappingResource) {
    _setList(ch.actifsource.example.modelsnippet.primarykeymanager.generic.GenericPackage.MappingModel_mappingResource, mappingResource);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public MappingModel setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // attributes
    _acceptSingleAttribute(java.lang.String.class, ch.actifsource.core.CorePackage.NamedResource_name, visitor);
    // relations
    _acceptList(ch.actifsource.example.modelsnippet.primarykeymanager.generic.javamodel.IMappingResource.class, ch.actifsource.example.modelsnippet.primarykeymanager.generic.GenericPackage.MappingModel_mappingResource, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

  // toMeRelations
  
  public static ch.actifsource.example.modelsnippet.primarykeymanager.generic.javamodel.IMappingModel selectToMeMappingResource(ch.actifsource.example.modelsnippet.primarykeymanager.generic.javamodel.IMappingResource object) {
    return _getToMeSingle(object.getRepository(), ch.actifsource.example.modelsnippet.primarykeymanager.generic.javamodel.IMappingModel.class, ch.actifsource.example.modelsnippet.primarykeymanager.generic.GenericPackage.MappingModel_mappingResource, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,7d354399-98d5-11ea-8ef1-cb1cd2be9da3,qdBW1Xz65Y2wbDRpY7b1Ay6M67g=] */
