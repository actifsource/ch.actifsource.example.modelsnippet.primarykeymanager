package ch.actifsource.example.modelsnippet.primarykeymanager.generic.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class MappingResource extends DynamicResource implements IMappingResource {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<IMappingResource> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<IMappingResource>() {
    
    @Override
    public IMappingResource create() {
      return new MappingResource();
    }
    
    @Override
    public IMappingResource create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new MappingResource(resourceRepository, resource);
    }
  
  };

  public MappingResource() {
    super(IMappingResource.TYPE_ID);
  }
  
  public MappingResource(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, IMappingResource.TYPE_ID);
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
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public MappingResource setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // attributes
    _acceptSingleAttribute(java.lang.String.class, ch.actifsource.core.CorePackage.NamedResource_name, visitor);
    // relations
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,7d35439d-98d5-11ea-8ef1-cb1cd2be9da3,i0eH3ILYrlMRXByIlZu2/9CN5Gw=] */
