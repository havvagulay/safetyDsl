/**
 * generated by Xtext 2.18.0
 */
package nl.wur.inf.safetyDSL.impl;

import java.util.Collection;

import nl.wur.inf.safetyDSL.DerivedFrom;
import nl.wur.inf.safetyDSL.SafetyDSLPackage;
import nl.wur.inf.safetyDSL.SafetyRequirement;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Derived From</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link nl.wur.inf.safetyDSL.impl.DerivedFromImpl#getSafetyRequirements <em>Safety Requirements</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DerivedFromImpl extends HazardRelationImpl implements DerivedFrom
{
  /**
   * The cached value of the '{@link #getSafetyRequirements() <em>Safety Requirements</em>}' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSafetyRequirements()
   * @generated
   * @ordered
   */
  protected EList<SafetyRequirement> safetyRequirements;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected DerivedFromImpl()
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
    return SafetyDSLPackage.Literals.DERIVED_FROM;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<SafetyRequirement> getSafetyRequirements()
  {
    if (safetyRequirements == null)
    {
      safetyRequirements = new EObjectResolvingEList<SafetyRequirement>(SafetyRequirement.class, this, SafetyDSLPackage.DERIVED_FROM__SAFETY_REQUIREMENTS);
    }
    return safetyRequirements;
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
      case SafetyDSLPackage.DERIVED_FROM__SAFETY_REQUIREMENTS:
        return getSafetyRequirements();
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
      case SafetyDSLPackage.DERIVED_FROM__SAFETY_REQUIREMENTS:
        getSafetyRequirements().clear();
        getSafetyRequirements().addAll((Collection<? extends SafetyRequirement>)newValue);
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
      case SafetyDSLPackage.DERIVED_FROM__SAFETY_REQUIREMENTS:
        getSafetyRequirements().clear();
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
      case SafetyDSLPackage.DERIVED_FROM__SAFETY_REQUIREMENTS:
        return safetyRequirements != null && !safetyRequirements.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //DerivedFromImpl