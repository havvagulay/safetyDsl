/**
 * generated by Xtext 2.18.0
 */
package nl.wur.inf.safetyDSL;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Safety Critical Viewpoint</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link nl.wur.inf.safetyDSL.SafetyCriticalViewpoint#getElements <em>Elements</em>}</li>
 *   <li>{@link nl.wur.inf.safetyDSL.SafetyCriticalViewpoint#getRelations <em>Relations</em>}</li>
 * </ul>
 *
 * @see nl.wur.inf.safetyDSL.SafetyDSLPackage#getSafetyCriticalViewpoint()
 * @model
 * @generated
 */
public interface SafetyCriticalViewpoint extends SafetyViewpoint
{
  /**
   * Returns the value of the '<em><b>Elements</b></em>' containment reference list.
   * The list contents are of type {@link nl.wur.inf.safetyDSL.ArchitecturalElement}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Elements</em>' containment reference list.
   * @see nl.wur.inf.safetyDSL.SafetyDSLPackage#getSafetyCriticalViewpoint_Elements()
   * @model containment="true"
   * @generated
   */
  EList<ArchitecturalElement> getElements();

  /**
   * Returns the value of the '<em><b>Relations</b></em>' containment reference list.
   * The list contents are of type {@link nl.wur.inf.safetyDSL.SafetyCriticalRelation}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Relations</em>' containment reference list.
   * @see nl.wur.inf.safetyDSL.SafetyDSLPackage#getSafetyCriticalViewpoint_Relations()
   * @model containment="true"
   * @generated
   */
  EList<SafetyCriticalRelation> getRelations();

} // SafetyCriticalViewpoint
