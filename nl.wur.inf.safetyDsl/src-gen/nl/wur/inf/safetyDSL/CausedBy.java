/**
 * generated by Xtext 2.18.0
 */
package nl.wur.inf.safetyDSL;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Caused By</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link nl.wur.inf.safetyDSL.CausedBy#getFault <em>Fault</em>}</li>
 * </ul>
 *
 * @see nl.wur.inf.safetyDSL.SafetyDSLPackage#getCausedBy()
 * @model
 * @generated
 */
public interface CausedBy extends HazardRelation
{
  /**
   * Returns the value of the '<em><b>Fault</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Fault</em>' reference.
   * @see #setFault(FaultTree)
   * @see nl.wur.inf.safetyDSL.SafetyDSLPackage#getCausedBy_Fault()
   * @model
   * @generated
   */
  FaultTree getFault();

  /**
   * Sets the value of the '{@link nl.wur.inf.safetyDSL.CausedBy#getFault <em>Fault</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Fault</em>' reference.
   * @see #getFault()
   * @generated
   */
  void setFault(FaultTree value);

} // CausedBy