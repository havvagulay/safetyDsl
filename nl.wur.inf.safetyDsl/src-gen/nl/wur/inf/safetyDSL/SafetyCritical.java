/**
 * generated by Xtext 2.18.0
 */
package nl.wur.inf.safetyDSL;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Safety Critical</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link nl.wur.inf.safetyDSL.SafetyCritical#getLevel <em>Level</em>}</li>
 *   <li>{@link nl.wur.inf.safetyDSL.SafetyCritical#getImplementedSafetyRequirements <em>Implemented Safety Requirements</em>}</li>
 *   <li>{@link nl.wur.inf.safetyDSL.SafetyCritical#getImplementedTactics <em>Implemented Tactics</em>}</li>
 *   <li>{@link nl.wur.inf.safetyDSL.SafetyCritical#getSubelements <em>Subelements</em>}</li>
 *   <li>{@link nl.wur.inf.safetyDSL.SafetyCritical#getStates <em>States</em>}</li>
 * </ul>
 *
 * @see nl.wur.inf.safetyDSL.SafetyDSLPackage#getSafetyCritical()
 * @model
 * @generated
 */
public interface SafetyCritical extends ArchitecturalElement
{
  /**
   * Returns the value of the '<em><b>Level</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Level</em>' containment reference.
   * @see #setLevel(CriticalityLevel)
   * @see nl.wur.inf.safetyDSL.SafetyDSLPackage#getSafetyCritical_Level()
   * @model containment="true"
   * @generated
   */
  CriticalityLevel getLevel();

  /**
   * Sets the value of the '{@link nl.wur.inf.safetyDSL.SafetyCritical#getLevel <em>Level</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Level</em>' containment reference.
   * @see #getLevel()
   * @generated
   */
  void setLevel(CriticalityLevel value);

  /**
   * Returns the value of the '<em><b>Implemented Safety Requirements</b></em>' reference list.
   * The list contents are of type {@link nl.wur.inf.safetyDSL.SafetyRequirement}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Implemented Safety Requirements</em>' reference list.
   * @see nl.wur.inf.safetyDSL.SafetyDSLPackage#getSafetyCritical_ImplementedSafetyRequirements()
   * @model
   * @generated
   */
  EList<SafetyRequirement> getImplementedSafetyRequirements();

  /**
   * Returns the value of the '<em><b>Implemented Tactics</b></em>' reference list.
   * The list contents are of type {@link nl.wur.inf.safetyDSL.SafetyTactic}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Implemented Tactics</em>' reference list.
   * @see nl.wur.inf.safetyDSL.SafetyDSLPackage#getSafetyCritical_ImplementedTactics()
   * @model
   * @generated
   */
  EList<SafetyTactic> getImplementedTactics();

  /**
   * Returns the value of the '<em><b>Subelements</b></em>' reference list.
   * The list contents are of type {@link nl.wur.inf.safetyDSL.SafetyCritical}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Subelements</em>' reference list.
   * @see nl.wur.inf.safetyDSL.SafetyDSLPackage#getSafetyCritical_Subelements()
   * @model
   * @generated
   */
  EList<SafetyCritical> getSubelements();

  /**
   * Returns the value of the '<em><b>States</b></em>' reference list.
   * The list contents are of type {@link nl.wur.inf.safetyDSL.State}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>States</em>' reference list.
   * @see nl.wur.inf.safetyDSL.SafetyDSLPackage#getSafetyCritical_States()
   * @model
   * @generated
   */
  EList<State> getStates();

} // SafetyCritical