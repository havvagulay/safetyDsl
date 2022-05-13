/**
 * generated by Xtext 2.18.0
 */
package nl.wur.inf.safetyDSL.impl;

import java.util.Collection;

import nl.wur.inf.safetyDSL.NonSafetyCritical;
import nl.wur.inf.safetyDSL.SafetyDSLPackage;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Non Safety Critical</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link nl.wur.inf.safetyDSL.impl.NonSafetyCriticalImpl#getSubelements <em>Subelements</em>}</li>
 * </ul>
 *
 * @generated
 */
public class NonSafetyCriticalImpl extends ArchitecturalElementImpl implements NonSafetyCritical
{
  /**
   * The cached value of the '{@link #getSubelements() <em>Subelements</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSubelements()
   * @generated
   * @ordered
   */
  protected EList<NonSafetyCritical> subelements;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected NonSafetyCriticalImpl()
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
    return SafetyDSLPackage.Literals.NON_SAFETY_CRITICAL;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<NonSafetyCritical> getSubelements()
  {
    if (subelements == null)
    {
      subelements = new EObjectContainmentEList<NonSafetyCritical>(NonSafetyCritical.class, this, SafetyDSLPackage.NON_SAFETY_CRITICAL__SUBELEMENTS);
    }
    return subelements;
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
      case SafetyDSLPackage.NON_SAFETY_CRITICAL__SUBELEMENTS:
        return ((InternalEList<?>)getSubelements()).basicRemove(otherEnd, msgs);
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
      case SafetyDSLPackage.NON_SAFETY_CRITICAL__SUBELEMENTS:
        return getSubelements();
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
      case SafetyDSLPackage.NON_SAFETY_CRITICAL__SUBELEMENTS:
        getSubelements().clear();
        getSubelements().addAll((Collection<? extends NonSafetyCritical>)newValue);
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
      case SafetyDSLPackage.NON_SAFETY_CRITICAL__SUBELEMENTS:
        getSubelements().clear();
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
      case SafetyDSLPackage.NON_SAFETY_CRITICAL__SUBELEMENTS:
        return subelements != null && !subelements.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //NonSafetyCriticalImpl
