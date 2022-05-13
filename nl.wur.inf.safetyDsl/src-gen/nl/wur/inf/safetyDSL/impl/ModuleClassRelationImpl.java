/**
 * generated by Xtext 2.18.0
 */
package nl.wur.inf.safetyDSL.impl;

import java.util.Collection;

import nl.wur.inf.safetyDSL.ArchitecturalElement;
import nl.wur.inf.safetyDSL.ClassDef;
import nl.wur.inf.safetyDSL.ModuleClassRelation;
import nl.wur.inf.safetyDSL.SafetyDSLPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Module Class Relation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link nl.wur.inf.safetyDSL.impl.ModuleClassRelationImpl#getModule <em>Module</em>}</li>
 *   <li>{@link nl.wur.inf.safetyDSL.impl.ModuleClassRelationImpl#getClasses <em>Classes</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ModuleClassRelationImpl extends MinimalEObjectImpl.Container implements ModuleClassRelation
{
  /**
   * The cached value of the '{@link #getModule() <em>Module</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getModule()
   * @generated
   * @ordered
   */
  protected ArchitecturalElement module;

  /**
   * The cached value of the '{@link #getClasses() <em>Classes</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getClasses()
   * @generated
   * @ordered
   */
  protected EList<ClassDef> classes;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ModuleClassRelationImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return SafetyDSLPackage.Literals.MODULE_CLASS_RELATION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public ArchitecturalElement getModule()
  {
    if (module != null && module.eIsProxy())
    {
      InternalEObject oldModule = (InternalEObject)module;
      module = (ArchitecturalElement)eResolveProxy(oldModule);
      if (module != oldModule)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, SafetyDSLPackage.MODULE_CLASS_RELATION__MODULE, oldModule, module));
      }
    }
    return module;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ArchitecturalElement basicGetModule()
  {
    return module;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setModule(ArchitecturalElement newModule)
  {
    ArchitecturalElement oldModule = module;
    module = newModule;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SafetyDSLPackage.MODULE_CLASS_RELATION__MODULE, oldModule, module));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<ClassDef> getClasses()
  {
    if (classes == null)
    {
      classes = new EObjectContainmentEList<ClassDef>(ClassDef.class, this, SafetyDSLPackage.MODULE_CLASS_RELATION__CLASSES);
    }
    return classes;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case SafetyDSLPackage.MODULE_CLASS_RELATION__CLASSES:
        return ((InternalEList<?>)getClasses()).basicRemove(otherEnd, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case SafetyDSLPackage.MODULE_CLASS_RELATION__MODULE:
        if (resolve) return getModule();
        return basicGetModule();
      case SafetyDSLPackage.MODULE_CLASS_RELATION__CLASSES:
        return getClasses();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case SafetyDSLPackage.MODULE_CLASS_RELATION__MODULE:
        setModule((ArchitecturalElement)newValue);
        return;
      case SafetyDSLPackage.MODULE_CLASS_RELATION__CLASSES:
        getClasses().clear();
        getClasses().addAll((Collection<? extends ClassDef>)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case SafetyDSLPackage.MODULE_CLASS_RELATION__MODULE:
        setModule((ArchitecturalElement)null);
        return;
      case SafetyDSLPackage.MODULE_CLASS_RELATION__CLASSES:
        getClasses().clear();
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case SafetyDSLPackage.MODULE_CLASS_RELATION__MODULE:
        return module != null;
      case SafetyDSLPackage.MODULE_CLASS_RELATION__CLASSES:
        return classes != null && !classes.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //ModuleClassRelationImpl