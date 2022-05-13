/**
 * generated by Xtext 2.18.0
 */
package nl.wur.inf.safetyDSL.impl;

import java.util.Collection;

import nl.wur.inf.safetyDSL.ClassTestCaseRelation;
import nl.wur.inf.safetyDSL.ImplementationDetail;
import nl.wur.inf.safetyDSL.ModuleClassRelation;
import nl.wur.inf.safetyDSL.SafetyDSLPackage;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Implementation Detail</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link nl.wur.inf.safetyDSL.impl.ImplementationDetailImpl#getModuleClassRelations <em>Module Class Relations</em>}</li>
 *   <li>{@link nl.wur.inf.safetyDSL.impl.ImplementationDetailImpl#getClassTestCaseRelations <em>Class Test Case Relations</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ImplementationDetailImpl extends MinimalEObjectImpl.Container implements ImplementationDetail
{
  /**
   * The cached value of the '{@link #getModuleClassRelations() <em>Module Class Relations</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getModuleClassRelations()
   * @generated
   * @ordered
   */
  protected EList<ModuleClassRelation> moduleClassRelations;

  /**
   * The cached value of the '{@link #getClassTestCaseRelations() <em>Class Test Case Relations</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getClassTestCaseRelations()
   * @generated
   * @ordered
   */
  protected EList<ClassTestCaseRelation> classTestCaseRelations;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ImplementationDetailImpl()
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
    return SafetyDSLPackage.Literals.IMPLEMENTATION_DETAIL;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<ModuleClassRelation> getModuleClassRelations()
  {
    if (moduleClassRelations == null)
    {
      moduleClassRelations = new EObjectContainmentEList<ModuleClassRelation>(ModuleClassRelation.class, this, SafetyDSLPackage.IMPLEMENTATION_DETAIL__MODULE_CLASS_RELATIONS);
    }
    return moduleClassRelations;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<ClassTestCaseRelation> getClassTestCaseRelations()
  {
    if (classTestCaseRelations == null)
    {
      classTestCaseRelations = new EObjectContainmentEList<ClassTestCaseRelation>(ClassTestCaseRelation.class, this, SafetyDSLPackage.IMPLEMENTATION_DETAIL__CLASS_TEST_CASE_RELATIONS);
    }
    return classTestCaseRelations;
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
      case SafetyDSLPackage.IMPLEMENTATION_DETAIL__MODULE_CLASS_RELATIONS:
        return ((InternalEList<?>)getModuleClassRelations()).basicRemove(otherEnd, msgs);
      case SafetyDSLPackage.IMPLEMENTATION_DETAIL__CLASS_TEST_CASE_RELATIONS:
        return ((InternalEList<?>)getClassTestCaseRelations()).basicRemove(otherEnd, msgs);
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
      case SafetyDSLPackage.IMPLEMENTATION_DETAIL__MODULE_CLASS_RELATIONS:
        return getModuleClassRelations();
      case SafetyDSLPackage.IMPLEMENTATION_DETAIL__CLASS_TEST_CASE_RELATIONS:
        return getClassTestCaseRelations();
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
      case SafetyDSLPackage.IMPLEMENTATION_DETAIL__MODULE_CLASS_RELATIONS:
        getModuleClassRelations().clear();
        getModuleClassRelations().addAll((Collection<? extends ModuleClassRelation>)newValue);
        return;
      case SafetyDSLPackage.IMPLEMENTATION_DETAIL__CLASS_TEST_CASE_RELATIONS:
        getClassTestCaseRelations().clear();
        getClassTestCaseRelations().addAll((Collection<? extends ClassTestCaseRelation>)newValue);
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
      case SafetyDSLPackage.IMPLEMENTATION_DETAIL__MODULE_CLASS_RELATIONS:
        getModuleClassRelations().clear();
        return;
      case SafetyDSLPackage.IMPLEMENTATION_DETAIL__CLASS_TEST_CASE_RELATIONS:
        getClassTestCaseRelations().clear();
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
      case SafetyDSLPackage.IMPLEMENTATION_DETAIL__MODULE_CLASS_RELATIONS:
        return moduleClassRelations != null && !moduleClassRelations.isEmpty();
      case SafetyDSLPackage.IMPLEMENTATION_DETAIL__CLASS_TEST_CASE_RELATIONS:
        return classTestCaseRelations != null && !classTestCaseRelations.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //ImplementationDetailImpl
