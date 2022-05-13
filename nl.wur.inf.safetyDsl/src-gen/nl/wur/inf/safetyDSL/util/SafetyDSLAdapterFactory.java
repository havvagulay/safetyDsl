/**
 * generated by Xtext 2.18.0
 */
package nl.wur.inf.safetyDSL.util;

import nl.wur.inf.safetyDSL.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see nl.wur.inf.safetyDSL.SafetyDSLPackage
 * @generated
 */
public class SafetyDSLAdapterFactory extends AdapterFactoryImpl
{
  /**
   * The cached model package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static SafetyDSLPackage modelPackage;

  /**
   * Creates an instance of the adapter factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SafetyDSLAdapterFactory()
  {
    if (modelPackage == null)
    {
      modelPackage = SafetyDSLPackage.eINSTANCE;
    }
  }

  /**
   * Returns whether this factory is applicable for the type of the object.
   * <!-- begin-user-doc -->
   * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
   * <!-- end-user-doc -->
   * @return whether this factory is applicable for the type of the object.
   * @generated
   */
  @Override
  public boolean isFactoryForType(Object object)
  {
    if (object == modelPackage)
    {
      return true;
    }
    if (object instanceof EObject)
    {
      return ((EObject)object).eClass().getEPackage() == modelPackage;
    }
    return false;
  }

  /**
   * The switch that delegates to the <code>createXXX</code> methods.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected SafetyDSLSwitch<Adapter> modelSwitch =
    new SafetyDSLSwitch<Adapter>()
    {
      @Override
      public Adapter caseSafetyFramework(SafetyFramework object)
      {
        return createSafetyFrameworkAdapter();
      }
      @Override
      public Adapter caseSafetyViewpoint(SafetyViewpoint object)
      {
        return createSafetyViewpointAdapter();
      }
      @Override
      public Adapter caseHazardViewpoint(HazardViewpoint object)
      {
        return createHazardViewpointAdapter();
      }
      @Override
      public Adapter caseHazardElement(HazardElement object)
      {
        return createHazardElementAdapter();
      }
      @Override
      public Adapter caseHazard(Hazard object)
      {
        return createHazardAdapter();
      }
      @Override
      public Adapter caseSafetyRequirement(SafetyRequirement object)
      {
        return createSafetyRequirementAdapter();
      }
      @Override
      public Adapter caseConsequence(Consequence object)
      {
        return createConsequenceAdapter();
      }
      @Override
      public Adapter caseFault(Fault object)
      {
        return createFaultAdapter();
      }
      @Override
      public Adapter caseFaultTree(FaultTree object)
      {
        return createFaultTreeAdapter();
      }
      @Override
      public Adapter caseFaultTreeNode(FaultTreeNode object)
      {
        return createFaultTreeNodeAdapter();
      }
      @Override
      public Adapter caseHazardRelation(HazardRelation object)
      {
        return createHazardRelationAdapter();
      }
      @Override
      public Adapter caseDerivedFrom(DerivedFrom object)
      {
        return createDerivedFromAdapter();
      }
      @Override
      public Adapter caseCauses(Causes object)
      {
        return createCausesAdapter();
      }
      @Override
      public Adapter caseCausedBy(CausedBy object)
      {
        return createCausedByAdapter();
      }
      @Override
      public Adapter caseSafetyTacticViewpoint(SafetyTacticViewpoint object)
      {
        return createSafetyTacticViewpointAdapter();
      }
      @Override
      public Adapter caseSafetyTactic(SafetyTactic object)
      {
        return createSafetyTacticAdapter();
      }
      @Override
      public Adapter caseFaultAvoidance(FaultAvoidance object)
      {
        return createFaultAvoidanceAdapter();
      }
      @Override
      public Adapter caseFaultDetection(FaultDetection object)
      {
        return createFaultDetectionAdapter();
      }
      @Override
      public Adapter caseFaultContainment(FaultContainment object)
      {
        return createFaultContainmentAdapter();
      }
      @Override
      public Adapter caseSafetyCriticalViewpoint(SafetyCriticalViewpoint object)
      {
        return createSafetyCriticalViewpointAdapter();
      }
      @Override
      public Adapter caseArchitecturalElement(ArchitecturalElement object)
      {
        return createArchitecturalElementAdapter();
      }
      @Override
      public Adapter caseSafetyCritical(SafetyCritical object)
      {
        return createSafetyCriticalAdapter();
      }
      @Override
      public Adapter caseCriticalityLevel(CriticalityLevel object)
      {
        return createCriticalityLevelAdapter();
      }
      @Override
      public Adapter caseNonSafetyCritical(NonSafetyCritical object)
      {
        return createNonSafetyCriticalAdapter();
      }
      @Override
      public Adapter caseMonitor(Monitor object)
      {
        return createMonitorAdapter();
      }
      @Override
      public Adapter caseState(State object)
      {
        return createStateAdapter();
      }
      @Override
      public Adapter caseSafetyCriticalRelation(SafetyCriticalRelation object)
      {
        return createSafetyCriticalRelationAdapter();
      }
      @Override
      public Adapter caseArchElementToArchElement(ArchElementToArchElement object)
      {
        return createArchElementToArchElementAdapter();
      }
      @Override
      public Adapter caseMonitorToArchitecturalElement(MonitorToArchitecturalElement object)
      {
        return createMonitorToArchitecturalElementAdapter();
      }
      @Override
      public Adapter caseReportsFault(ReportsFault object)
      {
        return createReportsFaultAdapter();
      }
      @Override
      public Adapter caseImplementationDetail(ImplementationDetail object)
      {
        return createImplementationDetailAdapter();
      }
      @Override
      public Adapter caseModuleClassRelation(ModuleClassRelation object)
      {
        return createModuleClassRelationAdapter();
      }
      @Override
      public Adapter caseClassTestCaseRelation(ClassTestCaseRelation object)
      {
        return createClassTestCaseRelationAdapter();
      }
      @Override
      public Adapter caseClassDef(ClassDef object)
      {
        return createClassDefAdapter();
      }
      @Override
      public Adapter caseORNodeExpression(ORNodeExpression object)
      {
        return createORNodeExpressionAdapter();
      }
      @Override
      public Adapter caseANDNodeExpression(ANDNodeExpression object)
      {
        return createANDNodeExpressionAdapter();
      }
      @Override
      public Adapter caseLevelA(LevelA object)
      {
        return createLevelAAdapter();
      }
      @Override
      public Adapter caseLevelB(LevelB object)
      {
        return createLevelBAdapter();
      }
      @Override
      public Adapter caseLevelC(LevelC object)
      {
        return createLevelCAdapter();
      }
      @Override
      public Adapter caseLevelD(LevelD object)
      {
        return createLevelDAdapter();
      }
      @Override
      public Adapter caseSafeState(SafeState object)
      {
        return createSafeStateAdapter();
      }
      @Override
      public Adapter caseReads(Reads object)
      {
        return createReadsAdapter();
      }
      @Override
      public Adapter caseWrites(Writes object)
      {
        return createWritesAdapter();
      }
      @Override
      public Adapter caseCommands(Commands object)
      {
        return createCommandsAdapter();
      }
      @Override
      public Adapter caseStops(Stops object)
      {
        return createStopsAdapter();
      }
      @Override
      public Adapter caseStarts(Starts object)
      {
        return createStartsAdapter();
      }
      @Override
      public Adapter caseInits(Inits object)
      {
        return createInitsAdapter();
      }
      @Override
      public Adapter caseRestarts(Restarts object)
      {
        return createRestartsAdapter();
      }
      @Override
      public Adapter caseMonitors(Monitors object)
      {
        return createMonitorsAdapter();
      }
      @Override
      public Adapter defaultCase(EObject object)
      {
        return createEObjectAdapter();
      }
    };

  /**
   * Creates an adapter for the <code>target</code>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param target the object to adapt.
   * @return the adapter for the <code>target</code>.
   * @generated
   */
  @Override
  public Adapter createAdapter(Notifier target)
  {
    return modelSwitch.doSwitch((EObject)target);
  }


  /**
   * Creates a new adapter for an object of class '{@link nl.wur.inf.safetyDSL.SafetyFramework <em>Safety Framework</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see nl.wur.inf.safetyDSL.SafetyFramework
   * @generated
   */
  public Adapter createSafetyFrameworkAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link nl.wur.inf.safetyDSL.SafetyViewpoint <em>Safety Viewpoint</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see nl.wur.inf.safetyDSL.SafetyViewpoint
   * @generated
   */
  public Adapter createSafetyViewpointAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link nl.wur.inf.safetyDSL.HazardViewpoint <em>Hazard Viewpoint</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see nl.wur.inf.safetyDSL.HazardViewpoint
   * @generated
   */
  public Adapter createHazardViewpointAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link nl.wur.inf.safetyDSL.HazardElement <em>Hazard Element</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see nl.wur.inf.safetyDSL.HazardElement
   * @generated
   */
  public Adapter createHazardElementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link nl.wur.inf.safetyDSL.Hazard <em>Hazard</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see nl.wur.inf.safetyDSL.Hazard
   * @generated
   */
  public Adapter createHazardAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link nl.wur.inf.safetyDSL.SafetyRequirement <em>Safety Requirement</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see nl.wur.inf.safetyDSL.SafetyRequirement
   * @generated
   */
  public Adapter createSafetyRequirementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link nl.wur.inf.safetyDSL.Consequence <em>Consequence</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see nl.wur.inf.safetyDSL.Consequence
   * @generated
   */
  public Adapter createConsequenceAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link nl.wur.inf.safetyDSL.Fault <em>Fault</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see nl.wur.inf.safetyDSL.Fault
   * @generated
   */
  public Adapter createFaultAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link nl.wur.inf.safetyDSL.FaultTree <em>Fault Tree</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see nl.wur.inf.safetyDSL.FaultTree
   * @generated
   */
  public Adapter createFaultTreeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link nl.wur.inf.safetyDSL.FaultTreeNode <em>Fault Tree Node</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see nl.wur.inf.safetyDSL.FaultTreeNode
   * @generated
   */
  public Adapter createFaultTreeNodeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link nl.wur.inf.safetyDSL.HazardRelation <em>Hazard Relation</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see nl.wur.inf.safetyDSL.HazardRelation
   * @generated
   */
  public Adapter createHazardRelationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link nl.wur.inf.safetyDSL.DerivedFrom <em>Derived From</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see nl.wur.inf.safetyDSL.DerivedFrom
   * @generated
   */
  public Adapter createDerivedFromAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link nl.wur.inf.safetyDSL.Causes <em>Causes</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see nl.wur.inf.safetyDSL.Causes
   * @generated
   */
  public Adapter createCausesAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link nl.wur.inf.safetyDSL.CausedBy <em>Caused By</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see nl.wur.inf.safetyDSL.CausedBy
   * @generated
   */
  public Adapter createCausedByAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link nl.wur.inf.safetyDSL.SafetyTacticViewpoint <em>Safety Tactic Viewpoint</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see nl.wur.inf.safetyDSL.SafetyTacticViewpoint
   * @generated
   */
  public Adapter createSafetyTacticViewpointAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link nl.wur.inf.safetyDSL.SafetyTactic <em>Safety Tactic</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see nl.wur.inf.safetyDSL.SafetyTactic
   * @generated
   */
  public Adapter createSafetyTacticAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link nl.wur.inf.safetyDSL.FaultAvoidance <em>Fault Avoidance</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see nl.wur.inf.safetyDSL.FaultAvoidance
   * @generated
   */
  public Adapter createFaultAvoidanceAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link nl.wur.inf.safetyDSL.FaultDetection <em>Fault Detection</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see nl.wur.inf.safetyDSL.FaultDetection
   * @generated
   */
  public Adapter createFaultDetectionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link nl.wur.inf.safetyDSL.FaultContainment <em>Fault Containment</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see nl.wur.inf.safetyDSL.FaultContainment
   * @generated
   */
  public Adapter createFaultContainmentAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link nl.wur.inf.safetyDSL.SafetyCriticalViewpoint <em>Safety Critical Viewpoint</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see nl.wur.inf.safetyDSL.SafetyCriticalViewpoint
   * @generated
   */
  public Adapter createSafetyCriticalViewpointAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link nl.wur.inf.safetyDSL.ArchitecturalElement <em>Architectural Element</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see nl.wur.inf.safetyDSL.ArchitecturalElement
   * @generated
   */
  public Adapter createArchitecturalElementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link nl.wur.inf.safetyDSL.SafetyCritical <em>Safety Critical</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see nl.wur.inf.safetyDSL.SafetyCritical
   * @generated
   */
  public Adapter createSafetyCriticalAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link nl.wur.inf.safetyDSL.CriticalityLevel <em>Criticality Level</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see nl.wur.inf.safetyDSL.CriticalityLevel
   * @generated
   */
  public Adapter createCriticalityLevelAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link nl.wur.inf.safetyDSL.NonSafetyCritical <em>Non Safety Critical</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see nl.wur.inf.safetyDSL.NonSafetyCritical
   * @generated
   */
  public Adapter createNonSafetyCriticalAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link nl.wur.inf.safetyDSL.Monitor <em>Monitor</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see nl.wur.inf.safetyDSL.Monitor
   * @generated
   */
  public Adapter createMonitorAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link nl.wur.inf.safetyDSL.State <em>State</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see nl.wur.inf.safetyDSL.State
   * @generated
   */
  public Adapter createStateAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link nl.wur.inf.safetyDSL.SafetyCriticalRelation <em>Safety Critical Relation</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see nl.wur.inf.safetyDSL.SafetyCriticalRelation
   * @generated
   */
  public Adapter createSafetyCriticalRelationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link nl.wur.inf.safetyDSL.ArchElementToArchElement <em>Arch Element To Arch Element</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see nl.wur.inf.safetyDSL.ArchElementToArchElement
   * @generated
   */
  public Adapter createArchElementToArchElementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link nl.wur.inf.safetyDSL.MonitorToArchitecturalElement <em>Monitor To Architectural Element</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see nl.wur.inf.safetyDSL.MonitorToArchitecturalElement
   * @generated
   */
  public Adapter createMonitorToArchitecturalElementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link nl.wur.inf.safetyDSL.ReportsFault <em>Reports Fault</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see nl.wur.inf.safetyDSL.ReportsFault
   * @generated
   */
  public Adapter createReportsFaultAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link nl.wur.inf.safetyDSL.ImplementationDetail <em>Implementation Detail</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see nl.wur.inf.safetyDSL.ImplementationDetail
   * @generated
   */
  public Adapter createImplementationDetailAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link nl.wur.inf.safetyDSL.ModuleClassRelation <em>Module Class Relation</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see nl.wur.inf.safetyDSL.ModuleClassRelation
   * @generated
   */
  public Adapter createModuleClassRelationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link nl.wur.inf.safetyDSL.ClassTestCaseRelation <em>Class Test Case Relation</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see nl.wur.inf.safetyDSL.ClassTestCaseRelation
   * @generated
   */
  public Adapter createClassTestCaseRelationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link nl.wur.inf.safetyDSL.ClassDef <em>Class Def</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see nl.wur.inf.safetyDSL.ClassDef
   * @generated
   */
  public Adapter createClassDefAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link nl.wur.inf.safetyDSL.ORNodeExpression <em>OR Node Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see nl.wur.inf.safetyDSL.ORNodeExpression
   * @generated
   */
  public Adapter createORNodeExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link nl.wur.inf.safetyDSL.ANDNodeExpression <em>AND Node Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see nl.wur.inf.safetyDSL.ANDNodeExpression
   * @generated
   */
  public Adapter createANDNodeExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link nl.wur.inf.safetyDSL.LevelA <em>Level A</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see nl.wur.inf.safetyDSL.LevelA
   * @generated
   */
  public Adapter createLevelAAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link nl.wur.inf.safetyDSL.LevelB <em>Level B</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see nl.wur.inf.safetyDSL.LevelB
   * @generated
   */
  public Adapter createLevelBAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link nl.wur.inf.safetyDSL.LevelC <em>Level C</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see nl.wur.inf.safetyDSL.LevelC
   * @generated
   */
  public Adapter createLevelCAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link nl.wur.inf.safetyDSL.LevelD <em>Level D</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see nl.wur.inf.safetyDSL.LevelD
   * @generated
   */
  public Adapter createLevelDAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link nl.wur.inf.safetyDSL.SafeState <em>Safe State</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see nl.wur.inf.safetyDSL.SafeState
   * @generated
   */
  public Adapter createSafeStateAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link nl.wur.inf.safetyDSL.Reads <em>Reads</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see nl.wur.inf.safetyDSL.Reads
   * @generated
   */
  public Adapter createReadsAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link nl.wur.inf.safetyDSL.Writes <em>Writes</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see nl.wur.inf.safetyDSL.Writes
   * @generated
   */
  public Adapter createWritesAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link nl.wur.inf.safetyDSL.Commands <em>Commands</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see nl.wur.inf.safetyDSL.Commands
   * @generated
   */
  public Adapter createCommandsAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link nl.wur.inf.safetyDSL.Stops <em>Stops</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see nl.wur.inf.safetyDSL.Stops
   * @generated
   */
  public Adapter createStopsAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link nl.wur.inf.safetyDSL.Starts <em>Starts</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see nl.wur.inf.safetyDSL.Starts
   * @generated
   */
  public Adapter createStartsAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link nl.wur.inf.safetyDSL.Inits <em>Inits</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see nl.wur.inf.safetyDSL.Inits
   * @generated
   */
  public Adapter createInitsAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link nl.wur.inf.safetyDSL.Restarts <em>Restarts</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see nl.wur.inf.safetyDSL.Restarts
   * @generated
   */
  public Adapter createRestartsAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link nl.wur.inf.safetyDSL.Monitors <em>Monitors</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see nl.wur.inf.safetyDSL.Monitors
   * @generated
   */
  public Adapter createMonitorsAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for the default case.
   * <!-- begin-user-doc -->
   * This default implementation returns null.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @generated
   */
  public Adapter createEObjectAdapter()
  {
    return null;
  }

} //SafetyDSLAdapterFactory