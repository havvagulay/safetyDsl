/**
 * generated by Xtext 2.18.0
 */
package nl.wur.inf.safetyDSL;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Reports Fault</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link nl.wur.inf.safetyDSL.ReportsFault#getSafetyCritical1 <em>Safety Critical1</em>}</li>
 *   <li>{@link nl.wur.inf.safetyDSL.ReportsFault#getSafetyCritical2 <em>Safety Critical2</em>}</li>
 * </ul>
 *
 * @see nl.wur.inf.safetyDSL.SafetyDSLPackage#getReportsFault()
 * @model
 * @generated
 */
public interface ReportsFault extends SafetyCriticalRelation
{
  /**
   * Returns the value of the '<em><b>Safety Critical1</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Safety Critical1</em>' reference.
   * @see #setSafetyCritical1(SafetyCritical)
   * @see nl.wur.inf.safetyDSL.SafetyDSLPackage#getReportsFault_SafetyCritical1()
   * @model
   * @generated
   */
  SafetyCritical getSafetyCritical1();

  /**
   * Sets the value of the '{@link nl.wur.inf.safetyDSL.ReportsFault#getSafetyCritical1 <em>Safety Critical1</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Safety Critical1</em>' reference.
   * @see #getSafetyCritical1()
   * @generated
   */
  void setSafetyCritical1(SafetyCritical value);

  /**
   * Returns the value of the '<em><b>Safety Critical2</b></em>' reference list.
   * The list contents are of type {@link nl.wur.inf.safetyDSL.SafetyCritical}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Safety Critical2</em>' reference list.
   * @see nl.wur.inf.safetyDSL.SafetyDSLPackage#getReportsFault_SafetyCritical2()
   * @model
   * @generated
   */
  EList<SafetyCritical> getSafetyCritical2();

} // ReportsFault
