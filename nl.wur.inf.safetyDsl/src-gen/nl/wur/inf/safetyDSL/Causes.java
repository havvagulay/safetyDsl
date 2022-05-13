/**
 * generated by Xtext 2.18.0
 */
package nl.wur.inf.safetyDSL;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Causes</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link nl.wur.inf.safetyDSL.Causes#getConsequences <em>Consequences</em>}</li>
 * </ul>
 *
 * @see nl.wur.inf.safetyDSL.SafetyDSLPackage#getCauses()
 * @model
 * @generated
 */
public interface Causes extends HazardRelation
{
  /**
   * Returns the value of the '<em><b>Consequences</b></em>' reference list.
   * The list contents are of type {@link nl.wur.inf.safetyDSL.Consequence}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Consequences</em>' reference list.
   * @see nl.wur.inf.safetyDSL.SafetyDSLPackage#getCauses_Consequences()
   * @model
   * @generated
   */
  EList<Consequence> getConsequences();

} // Causes