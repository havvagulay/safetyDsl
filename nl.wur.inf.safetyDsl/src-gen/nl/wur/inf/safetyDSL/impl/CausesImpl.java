/**
 * generated by Xtext 2.18.0
 */
package nl.wur.inf.safetyDSL.impl;

import java.util.Collection;

import nl.wur.inf.safetyDSL.Causes;
import nl.wur.inf.safetyDSL.Consequence;
import nl.wur.inf.safetyDSL.SafetyDSLPackage;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Causes</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link nl.wur.inf.safetyDSL.impl.CausesImpl#getConsequences <em>Consequences</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CausesImpl extends HazardRelationImpl implements Causes
{
  /**
   * The cached value of the '{@link #getConsequences() <em>Consequences</em>}' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getConsequences()
   * @generated
   * @ordered
   */
  protected EList<Consequence> consequences;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected CausesImpl()
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
    return SafetyDSLPackage.Literals.CAUSES;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<Consequence> getConsequences()
  {
    if (consequences == null)
    {
      consequences = new EObjectResolvingEList<Consequence>(Consequence.class, this, SafetyDSLPackage.CAUSES__CONSEQUENCES);
    }
    return consequences;
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
      case SafetyDSLPackage.CAUSES__CONSEQUENCES:
        return getConsequences();
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
      case SafetyDSLPackage.CAUSES__CONSEQUENCES:
        getConsequences().clear();
        getConsequences().addAll((Collection<? extends Consequence>)newValue);
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
      case SafetyDSLPackage.CAUSES__CONSEQUENCES:
        getConsequences().clear();
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
      case SafetyDSLPackage.CAUSES__CONSEQUENCES:
        return consequences != null && !consequences.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //CausesImpl
