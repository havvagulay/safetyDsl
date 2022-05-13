/*
 * generated by Xtext 2.18.0
 */
package nl.wur.inf.ide.contentassist.antlr;

import com.google.common.collect.ImmutableMap;
import com.google.inject.Inject;
import com.google.inject.Singleton;
import java.util.Map;
import nl.wur.inf.ide.contentassist.antlr.internal.InternalSafetyDSLParser;
import nl.wur.inf.services.SafetyDSLGrammarAccess;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ide.editor.contentassist.antlr.AbstractContentAssistParser;

public class SafetyDSLParser extends AbstractContentAssistParser {

	@Singleton
	public static final class NameMappings {
		
		private final Map<AbstractElement, String> mappings;
		
		@Inject
		public NameMappings(SafetyDSLGrammarAccess grammarAccess) {
			ImmutableMap.Builder<AbstractElement, String> builder = ImmutableMap.builder();
			init(builder, grammarAccess);
			this.mappings = builder.build();
		}
		
		public String getRuleName(AbstractElement element) {
			return mappings.get(element);
		}
		
		private static void init(ImmutableMap.Builder<AbstractElement, String> builder, SafetyDSLGrammarAccess grammarAccess) {
			builder.put(grammarAccess.getSafetyViewpointAccess().getAlternatives(), "rule__SafetyViewpoint__Alternatives");
			builder.put(grammarAccess.getHazardElementAccess().getAlternatives(), "rule__HazardElement__Alternatives");
			builder.put(grammarAccess.getPrimaryNodeAccess().getAlternatives(), "rule__PrimaryNode__Alternatives");
			builder.put(grammarAccess.getHazardRelationAccess().getAlternatives(), "rule__HazardRelation__Alternatives");
			builder.put(grammarAccess.getSafetyTacticAccess().getAlternatives(), "rule__SafetyTactic__Alternatives");
			builder.put(grammarAccess.getArchitecturalElementAccess().getAlternatives(), "rule__ArchitecturalElement__Alternatives");
			builder.put(grammarAccess.getCriticalityLevelAccess().getAlternatives(), "rule__CriticalityLevel__Alternatives");
			builder.put(grammarAccess.getNonSafetyCriticalAccess().getAlternatives_2(), "rule__NonSafetyCritical__Alternatives_2");
			builder.put(grammarAccess.getStateAccess().getAlternatives_0(), "rule__State__Alternatives_0");
			builder.put(grammarAccess.getSafetyCriticalRelationAccess().getAlternatives(), "rule__SafetyCriticalRelation__Alternatives");
			builder.put(grammarAccess.getArchElementToArchElementAccess().getAlternatives(), "rule__ArchElementToArchElement__Alternatives");
			builder.put(grammarAccess.getMonitorToArchitecturalElementAccess().getAlternatives(), "rule__MonitorToArchitecturalElement__Alternatives");
			builder.put(grammarAccess.getSafetyFrameworkAccess().getGroup(), "rule__SafetyFramework__Group__0");
			builder.put(grammarAccess.getHazardViewpointAccess().getGroup(), "rule__HazardViewpoint__Group__0");
			builder.put(grammarAccess.getHazardAccess().getGroup(), "rule__Hazard__Group__0");
			builder.put(grammarAccess.getSafetyRequirementAccess().getGroup(), "rule__SafetyRequirement__Group__0");
			builder.put(grammarAccess.getSafetyRequirementAccess().getGroup_3(), "rule__SafetyRequirement__Group_3__0");
			builder.put(grammarAccess.getConsequenceAccess().getGroup(), "rule__Consequence__Group__0");
			builder.put(grammarAccess.getFaultAccess().getGroup(), "rule__Fault__Group__0");
			builder.put(grammarAccess.getFaultTreeAccess().getGroup(), "rule__FaultTree__Group__0");
			builder.put(grammarAccess.getORNodeAccess().getGroup(), "rule__ORNode__Group__0");
			builder.put(grammarAccess.getORNodeAccess().getGroup_1(), "rule__ORNode__Group_1__0");
			builder.put(grammarAccess.getANDNodeAccess().getGroup(), "rule__ANDNode__Group__0");
			builder.put(grammarAccess.getANDNodeAccess().getGroup_1(), "rule__ANDNode__Group_1__0");
			builder.put(grammarAccess.getPrimaryNodeAccess().getGroup_1(), "rule__PrimaryNode__Group_1__0");
			builder.put(grammarAccess.getDerivedFromAccess().getGroup(), "rule__DerivedFrom__Group__0");
			builder.put(grammarAccess.getDerivedFromAccess().getGroup_1(), "rule__DerivedFrom__Group_1__0");
			builder.put(grammarAccess.getCausesAccess().getGroup(), "rule__Causes__Group__0");
			builder.put(grammarAccess.getCausesAccess().getGroup_3(), "rule__Causes__Group_3__0");
			builder.put(grammarAccess.getCausedByAccess().getGroup(), "rule__CausedBy__Group__0");
			builder.put(grammarAccess.getSafetyTacticViewpointAccess().getGroup(), "rule__SafetyTacticViewpoint__Group__0");
			builder.put(grammarAccess.getQualifiedNameAccess().getGroup(), "rule__QualifiedName__Group__0");
			builder.put(grammarAccess.getQualifiedNameAccess().getGroup_1(), "rule__QualifiedName__Group_1__0");
			builder.put(grammarAccess.getFaultAvoidanceAccess().getGroup(), "rule__FaultAvoidance__Group__0");
			builder.put(grammarAccess.getFaultAvoidanceAccess().getGroup_7(), "rule__FaultAvoidance__Group_7__0");
			builder.put(grammarAccess.getFaultDetectionAccess().getGroup(), "rule__FaultDetection__Group__0");
			builder.put(grammarAccess.getFaultDetectionAccess().getGroup_7(), "rule__FaultDetection__Group_7__0");
			builder.put(grammarAccess.getFaultContainmentAccess().getGroup(), "rule__FaultContainment__Group__0");
			builder.put(grammarAccess.getFaultContainmentAccess().getGroup_7(), "rule__FaultContainment__Group_7__0");
			builder.put(grammarAccess.getSafetyCriticalViewpointAccess().getGroup(), "rule__SafetyCriticalViewpoint__Group__0");
			builder.put(grammarAccess.getSafetyCriticalAccess().getGroup(), "rule__SafetyCritical__Group__0");
			builder.put(grammarAccess.getSafetyCriticalAccess().getGroup_8(), "rule__SafetyCritical__Group_8__0");
			builder.put(grammarAccess.getSafetyCriticalAccess().getGroup_10(), "rule__SafetyCritical__Group_10__0");
			builder.put(grammarAccess.getSafetyCriticalAccess().getGroup_10_2(), "rule__SafetyCritical__Group_10_2__0");
			builder.put(grammarAccess.getSafetyCriticalAccess().getGroup_11(), "rule__SafetyCritical__Group_11__0");
			builder.put(grammarAccess.getSafetyCriticalAccess().getGroup_11_2(), "rule__SafetyCritical__Group_11_2__0");
			builder.put(grammarAccess.getSafetyCriticalAccess().getGroup_12(), "rule__SafetyCritical__Group_12__0");
			builder.put(grammarAccess.getSafetyCriticalAccess().getGroup_12_2(), "rule__SafetyCritical__Group_12_2__0");
			builder.put(grammarAccess.getCriticalityLevelAccess().getGroup_0(), "rule__CriticalityLevel__Group_0__0");
			builder.put(grammarAccess.getCriticalityLevelAccess().getGroup_1(), "rule__CriticalityLevel__Group_1__0");
			builder.put(grammarAccess.getCriticalityLevelAccess().getGroup_2(), "rule__CriticalityLevel__Group_2__0");
			builder.put(grammarAccess.getCriticalityLevelAccess().getGroup_3(), "rule__CriticalityLevel__Group_3__0");
			builder.put(grammarAccess.getNonSafetyCriticalAccess().getGroup(), "rule__NonSafetyCritical__Group__0");
			builder.put(grammarAccess.getNonSafetyCriticalAccess().getGroup_2_0(), "rule__NonSafetyCritical__Group_2_0__0");
			builder.put(grammarAccess.getMonitorAccess().getGroup(), "rule__Monitor__Group__0");
			builder.put(grammarAccess.getMonitorAccess().getGroup_2(), "rule__Monitor__Group_2__0");
			builder.put(grammarAccess.getMonitorAccess().getGroup_2_3(), "rule__Monitor__Group_2_3__0");
			builder.put(grammarAccess.getStateAccess().getGroup(), "rule__State__Group__0");
			builder.put(grammarAccess.getStateAccess().getGroup_0_0(), "rule__State__Group_0_0__0");
			builder.put(grammarAccess.getStateAccess().getGroup_0_1(), "rule__State__Group_0_1__0");
			builder.put(grammarAccess.getStateAccess().getGroup_0_1_1(), "rule__State__Group_0_1_1__0");
			builder.put(grammarAccess.getArchElementToArchElementAccess().getGroup_0(), "rule__ArchElementToArchElement__Group_0__0");
			builder.put(grammarAccess.getArchElementToArchElementAccess().getGroup_0_1(), "rule__ArchElementToArchElement__Group_0_1__0");
			builder.put(grammarAccess.getArchElementToArchElementAccess().getGroup_0_1_3(), "rule__ArchElementToArchElement__Group_0_1_3__0");
			builder.put(grammarAccess.getArchElementToArchElementAccess().getGroup_1(), "rule__ArchElementToArchElement__Group_1__0");
			builder.put(grammarAccess.getArchElementToArchElementAccess().getGroup_1_1(), "rule__ArchElementToArchElement__Group_1_1__0");
			builder.put(grammarAccess.getArchElementToArchElementAccess().getGroup_1_1_3(), "rule__ArchElementToArchElement__Group_1_1_3__0");
			builder.put(grammarAccess.getArchElementToArchElementAccess().getGroup_2(), "rule__ArchElementToArchElement__Group_2__0");
			builder.put(grammarAccess.getArchElementToArchElementAccess().getGroup_2_1(), "rule__ArchElementToArchElement__Group_2_1__0");
			builder.put(grammarAccess.getArchElementToArchElementAccess().getGroup_2_1_3(), "rule__ArchElementToArchElement__Group_2_1_3__0");
			builder.put(grammarAccess.getMonitorToArchitecturalElementAccess().getGroup_0(), "rule__MonitorToArchitecturalElement__Group_0__0");
			builder.put(grammarAccess.getMonitorToArchitecturalElementAccess().getGroup_0_1(), "rule__MonitorToArchitecturalElement__Group_0_1__0");
			builder.put(grammarAccess.getMonitorToArchitecturalElementAccess().getGroup_0_1_3(), "rule__MonitorToArchitecturalElement__Group_0_1_3__0");
			builder.put(grammarAccess.getMonitorToArchitecturalElementAccess().getGroup_1(), "rule__MonitorToArchitecturalElement__Group_1__0");
			builder.put(grammarAccess.getMonitorToArchitecturalElementAccess().getGroup_1_1(), "rule__MonitorToArchitecturalElement__Group_1_1__0");
			builder.put(grammarAccess.getMonitorToArchitecturalElementAccess().getGroup_1_1_3(), "rule__MonitorToArchitecturalElement__Group_1_1_3__0");
			builder.put(grammarAccess.getMonitorToArchitecturalElementAccess().getGroup_2(), "rule__MonitorToArchitecturalElement__Group_2__0");
			builder.put(grammarAccess.getMonitorToArchitecturalElementAccess().getGroup_2_1(), "rule__MonitorToArchitecturalElement__Group_2_1__0");
			builder.put(grammarAccess.getMonitorToArchitecturalElementAccess().getGroup_2_1_3(), "rule__MonitorToArchitecturalElement__Group_2_1_3__0");
			builder.put(grammarAccess.getMonitorToArchitecturalElementAccess().getGroup_3(), "rule__MonitorToArchitecturalElement__Group_3__0");
			builder.put(grammarAccess.getMonitorToArchitecturalElementAccess().getGroup_3_1(), "rule__MonitorToArchitecturalElement__Group_3_1__0");
			builder.put(grammarAccess.getMonitorToArchitecturalElementAccess().getGroup_3_1_3(), "rule__MonitorToArchitecturalElement__Group_3_1_3__0");
			builder.put(grammarAccess.getMonitorToArchitecturalElementAccess().getGroup_4(), "rule__MonitorToArchitecturalElement__Group_4__0");
			builder.put(grammarAccess.getMonitorToArchitecturalElementAccess().getGroup_4_1(), "rule__MonitorToArchitecturalElement__Group_4_1__0");
			builder.put(grammarAccess.getMonitorToArchitecturalElementAccess().getGroup_4_1_3(), "rule__MonitorToArchitecturalElement__Group_4_1_3__0");
			builder.put(grammarAccess.getReportsFaultAccess().getGroup(), "rule__ReportsFault__Group__0");
			builder.put(grammarAccess.getReportsFaultAccess().getGroup_3(), "rule__ReportsFault__Group_3__0");
			builder.put(grammarAccess.getImplementationDetailAccess().getGroup(), "rule__ImplementationDetail__Group__0");
			builder.put(grammarAccess.getModuleClassRelationAccess().getGroup(), "rule__ModuleClassRelation__Group__0");
			builder.put(grammarAccess.getModuleClassRelationAccess().getGroup_5(), "rule__ModuleClassRelation__Group_5__0");
			builder.put(grammarAccess.getClassTestCaseRelationAccess().getGroup(), "rule__ClassTestCaseRelation__Group__0");
			builder.put(grammarAccess.getClassTestCaseRelationAccess().getGroup_5(), "rule__ClassTestCaseRelation__Group_5__0");
			builder.put(grammarAccess.getSafetyFrameworkAccess().getViewsAssignment_0(), "rule__SafetyFramework__ViewsAssignment_0");
			builder.put(grammarAccess.getSafetyFrameworkAccess().getDetailAssignment_1(), "rule__SafetyFramework__DetailAssignment_1");
			builder.put(grammarAccess.getHazardViewpointAccess().getNameAssignment_1(), "rule__HazardViewpoint__NameAssignment_1");
			builder.put(grammarAccess.getHazardViewpointAccess().getElementsAssignment_4(), "rule__HazardViewpoint__ElementsAssignment_4");
			builder.put(grammarAccess.getHazardViewpointAccess().getRelationsAssignment_7(), "rule__HazardViewpoint__RelationsAssignment_7");
			builder.put(grammarAccess.getHazardAccess().getNameAssignment_1(), "rule__Hazard__NameAssignment_1");
			builder.put(grammarAccess.getSafetyRequirementAccess().getNameAssignment_1(), "rule__SafetyRequirement__NameAssignment_1");
			builder.put(grammarAccess.getSafetyRequirementAccess().getSubrequirementsAssignment_3_1(), "rule__SafetyRequirement__SubrequirementsAssignment_3_1");
			builder.put(grammarAccess.getConsequenceAccess().getNameAssignment_1(), "rule__Consequence__NameAssignment_1");
			builder.put(grammarAccess.getFaultAccess().getNameAssignment_1(), "rule__Fault__NameAssignment_1");
			builder.put(grammarAccess.getFaultTreeAccess().getNameAssignment_1(), "rule__FaultTree__NameAssignment_1");
			builder.put(grammarAccess.getFaultTreeAccess().getRootNodeAssignment_2(), "rule__FaultTree__RootNodeAssignment_2");
			builder.put(grammarAccess.getORNodeAccess().getRightAssignment_1_2(), "rule__ORNode__RightAssignment_1_2");
			builder.put(grammarAccess.getANDNodeAccess().getRightAssignment_1_2(), "rule__ANDNode__RightAssignment_1_2");
			builder.put(grammarAccess.getPrimaryNodeAccess().getValueAssignment_0(), "rule__PrimaryNode__ValueAssignment_0");
			builder.put(grammarAccess.getDerivedFromAccess().getSafetyRequirementsAssignment_0(), "rule__DerivedFrom__SafetyRequirementsAssignment_0");
			builder.put(grammarAccess.getDerivedFromAccess().getSafetyRequirementsAssignment_1_1(), "rule__DerivedFrom__SafetyRequirementsAssignment_1_1");
			builder.put(grammarAccess.getDerivedFromAccess().getHazardAssignment_3(), "rule__DerivedFrom__HazardAssignment_3");
			builder.put(grammarAccess.getCausesAccess().getHazardAssignment_0(), "rule__Causes__HazardAssignment_0");
			builder.put(grammarAccess.getCausesAccess().getConsequencesAssignment_2(), "rule__Causes__ConsequencesAssignment_2");
			builder.put(grammarAccess.getCausesAccess().getConsequencesAssignment_3_1(), "rule__Causes__ConsequencesAssignment_3_1");
			builder.put(grammarAccess.getCausedByAccess().getHazardAssignment_0(), "rule__CausedBy__HazardAssignment_0");
			builder.put(grammarAccess.getCausedByAccess().getFaultAssignment_2(), "rule__CausedBy__FaultAssignment_2");
			builder.put(grammarAccess.getSafetyTacticViewpointAccess().getNameAssignment_1(), "rule__SafetyTacticViewpoint__NameAssignment_1");
			builder.put(grammarAccess.getSafetyTacticViewpointAccess().getSafetyTacticsAssignment_3(), "rule__SafetyTacticViewpoint__SafetyTacticsAssignment_3");
			builder.put(grammarAccess.getFaultAvoidanceAccess().getNameAssignment_1(), "rule__FaultAvoidance__NameAssignment_1");
			builder.put(grammarAccess.getFaultAvoidanceAccess().getTypeAssignment_4(), "rule__FaultAvoidance__TypeAssignment_4");
			builder.put(grammarAccess.getFaultAvoidanceAccess().getHandledFaultsAssignment_6(), "rule__FaultAvoidance__HandledFaultsAssignment_6");
			builder.put(grammarAccess.getFaultAvoidanceAccess().getHandledFaultsAssignment_7_1(), "rule__FaultAvoidance__HandledFaultsAssignment_7_1");
			builder.put(grammarAccess.getFaultDetectionAccess().getNameAssignment_1(), "rule__FaultDetection__NameAssignment_1");
			builder.put(grammarAccess.getFaultDetectionAccess().getTypeAssignment_4(), "rule__FaultDetection__TypeAssignment_4");
			builder.put(grammarAccess.getFaultDetectionAccess().getHandledFaultsAssignment_6(), "rule__FaultDetection__HandledFaultsAssignment_6");
			builder.put(grammarAccess.getFaultDetectionAccess().getHandledFaultsAssignment_7_1(), "rule__FaultDetection__HandledFaultsAssignment_7_1");
			builder.put(grammarAccess.getFaultContainmentAccess().getNameAssignment_1(), "rule__FaultContainment__NameAssignment_1");
			builder.put(grammarAccess.getFaultContainmentAccess().getTypeAssignment_4(), "rule__FaultContainment__TypeAssignment_4");
			builder.put(grammarAccess.getFaultContainmentAccess().getHandledFaultsAssignment_6(), "rule__FaultContainment__HandledFaultsAssignment_6");
			builder.put(grammarAccess.getFaultContainmentAccess().getHandledFaultsAssignment_7_1(), "rule__FaultContainment__HandledFaultsAssignment_7_1");
			builder.put(grammarAccess.getSafetyCriticalViewpointAccess().getNameAssignment_1(), "rule__SafetyCriticalViewpoint__NameAssignment_1");
			builder.put(grammarAccess.getSafetyCriticalViewpointAccess().getElementsAssignment_4(), "rule__SafetyCriticalViewpoint__ElementsAssignment_4");
			builder.put(grammarAccess.getSafetyCriticalViewpointAccess().getRelationsAssignment_7(), "rule__SafetyCriticalViewpoint__RelationsAssignment_7");
			builder.put(grammarAccess.getSafetyCriticalAccess().getNameAssignment_1(), "rule__SafetyCritical__NameAssignment_1");
			builder.put(grammarAccess.getSafetyCriticalAccess().getLevelAssignment_4(), "rule__SafetyCritical__LevelAssignment_4");
			builder.put(grammarAccess.getSafetyCriticalAccess().getImplementedSafetyRequirementsAssignment_7(), "rule__SafetyCritical__ImplementedSafetyRequirementsAssignment_7");
			builder.put(grammarAccess.getSafetyCriticalAccess().getImplementedSafetyRequirementsAssignment_8_1(), "rule__SafetyCritical__ImplementedSafetyRequirementsAssignment_8_1");
			builder.put(grammarAccess.getSafetyCriticalAccess().getImplementedTacticsAssignment_10_1(), "rule__SafetyCritical__ImplementedTacticsAssignment_10_1");
			builder.put(grammarAccess.getSafetyCriticalAccess().getImplementedTacticsAssignment_10_2_1(), "rule__SafetyCritical__ImplementedTacticsAssignment_10_2_1");
			builder.put(grammarAccess.getSafetyCriticalAccess().getSubelementsAssignment_11_1(), "rule__SafetyCritical__SubelementsAssignment_11_1");
			builder.put(grammarAccess.getSafetyCriticalAccess().getSubelementsAssignment_11_2_1(), "rule__SafetyCritical__SubelementsAssignment_11_2_1");
			builder.put(grammarAccess.getSafetyCriticalAccess().getStatesAssignment_12_1(), "rule__SafetyCritical__StatesAssignment_12_1");
			builder.put(grammarAccess.getSafetyCriticalAccess().getStatesAssignment_12_2_1(), "rule__SafetyCritical__StatesAssignment_12_2_1");
			builder.put(grammarAccess.getNonSafetyCriticalAccess().getNameAssignment_1(), "rule__NonSafetyCritical__NameAssignment_1");
			builder.put(grammarAccess.getNonSafetyCriticalAccess().getSubelementsAssignment_2_0_1(), "rule__NonSafetyCritical__SubelementsAssignment_2_0_1");
			builder.put(grammarAccess.getMonitorAccess().getNameAssignment_1(), "rule__Monitor__NameAssignment_1");
			builder.put(grammarAccess.getMonitorAccess().getImplementedTacticsAssignment_2_2(), "rule__Monitor__ImplementedTacticsAssignment_2_2");
			builder.put(grammarAccess.getMonitorAccess().getImplementedTacticsAssignment_2_3_1(), "rule__Monitor__ImplementedTacticsAssignment_2_3_1");
			builder.put(grammarAccess.getStateAccess().getNameAssignment_0_0_1(), "rule__State__NameAssignment_0_0_1");
			builder.put(grammarAccess.getStateAccess().getNameAssignment_0_1_1_1(), "rule__State__NameAssignment_0_1_1_1");
			builder.put(grammarAccess.getArchElementToArchElementAccess().getElement1Assignment_0_1_0(), "rule__ArchElementToArchElement__Element1Assignment_0_1_0");
			builder.put(grammarAccess.getArchElementToArchElementAccess().getElement2Assignment_0_1_2(), "rule__ArchElementToArchElement__Element2Assignment_0_1_2");
			builder.put(grammarAccess.getArchElementToArchElementAccess().getElement2Assignment_0_1_3_1(), "rule__ArchElementToArchElement__Element2Assignment_0_1_3_1");
			builder.put(grammarAccess.getArchElementToArchElementAccess().getElement1Assignment_1_1_0(), "rule__ArchElementToArchElement__Element1Assignment_1_1_0");
			builder.put(grammarAccess.getArchElementToArchElementAccess().getElement2Assignment_1_1_2(), "rule__ArchElementToArchElement__Element2Assignment_1_1_2");
			builder.put(grammarAccess.getArchElementToArchElementAccess().getElement2Assignment_1_1_3_1(), "rule__ArchElementToArchElement__Element2Assignment_1_1_3_1");
			builder.put(grammarAccess.getArchElementToArchElementAccess().getElement1Assignment_2_1_0(), "rule__ArchElementToArchElement__Element1Assignment_2_1_0");
			builder.put(grammarAccess.getArchElementToArchElementAccess().getElement2Assignment_2_1_2(), "rule__ArchElementToArchElement__Element2Assignment_2_1_2");
			builder.put(grammarAccess.getArchElementToArchElementAccess().getElement2Assignment_2_1_3_1(), "rule__ArchElementToArchElement__Element2Assignment_2_1_3_1");
			builder.put(grammarAccess.getMonitorToArchitecturalElementAccess().getMonitorAssignment_0_1_0(), "rule__MonitorToArchitecturalElement__MonitorAssignment_0_1_0");
			builder.put(grammarAccess.getMonitorToArchitecturalElementAccess().getSafetyCriticalAssignment_0_1_2(), "rule__MonitorToArchitecturalElement__SafetyCriticalAssignment_0_1_2");
			builder.put(grammarAccess.getMonitorToArchitecturalElementAccess().getSafetyCriticalAssignment_0_1_3_1(), "rule__MonitorToArchitecturalElement__SafetyCriticalAssignment_0_1_3_1");
			builder.put(grammarAccess.getMonitorToArchitecturalElementAccess().getMonitorAssignment_1_1_0(), "rule__MonitorToArchitecturalElement__MonitorAssignment_1_1_0");
			builder.put(grammarAccess.getMonitorToArchitecturalElementAccess().getSafetyCriticalAssignment_1_1_2(), "rule__MonitorToArchitecturalElement__SafetyCriticalAssignment_1_1_2");
			builder.put(grammarAccess.getMonitorToArchitecturalElementAccess().getSafetyCriticalAssignment_1_1_3_1(), "rule__MonitorToArchitecturalElement__SafetyCriticalAssignment_1_1_3_1");
			builder.put(grammarAccess.getMonitorToArchitecturalElementAccess().getMonitorAssignment_2_1_0(), "rule__MonitorToArchitecturalElement__MonitorAssignment_2_1_0");
			builder.put(grammarAccess.getMonitorToArchitecturalElementAccess().getSafetyCriticalAssignment_2_1_2(), "rule__MonitorToArchitecturalElement__SafetyCriticalAssignment_2_1_2");
			builder.put(grammarAccess.getMonitorToArchitecturalElementAccess().getSafetyCriticalAssignment_2_1_3_1(), "rule__MonitorToArchitecturalElement__SafetyCriticalAssignment_2_1_3_1");
			builder.put(grammarAccess.getMonitorToArchitecturalElementAccess().getMonitorAssignment_3_1_0(), "rule__MonitorToArchitecturalElement__MonitorAssignment_3_1_0");
			builder.put(grammarAccess.getMonitorToArchitecturalElementAccess().getSafetyCriticalAssignment_3_1_2(), "rule__MonitorToArchitecturalElement__SafetyCriticalAssignment_3_1_2");
			builder.put(grammarAccess.getMonitorToArchitecturalElementAccess().getSafetyCriticalAssignment_3_1_3_1(), "rule__MonitorToArchitecturalElement__SafetyCriticalAssignment_3_1_3_1");
			builder.put(grammarAccess.getMonitorToArchitecturalElementAccess().getMonitorAssignment_4_1_0(), "rule__MonitorToArchitecturalElement__MonitorAssignment_4_1_0");
			builder.put(grammarAccess.getMonitorToArchitecturalElementAccess().getSafetyCriticalAssignment_4_1_2(), "rule__MonitorToArchitecturalElement__SafetyCriticalAssignment_4_1_2");
			builder.put(grammarAccess.getMonitorToArchitecturalElementAccess().getSafetyCriticalAssignment_4_1_3_1(), "rule__MonitorToArchitecturalElement__SafetyCriticalAssignment_4_1_3_1");
			builder.put(grammarAccess.getReportsFaultAccess().getSafetyCritical1Assignment_0(), "rule__ReportsFault__SafetyCritical1Assignment_0");
			builder.put(grammarAccess.getReportsFaultAccess().getSafetyCritical2Assignment_2(), "rule__ReportsFault__SafetyCritical2Assignment_2");
			builder.put(grammarAccess.getReportsFaultAccess().getSafetyCritical2Assignment_3_1(), "rule__ReportsFault__SafetyCritical2Assignment_3_1");
			builder.put(grammarAccess.getImplementationDetailAccess().getModuleClassRelationsAssignment_3(), "rule__ImplementationDetail__ModuleClassRelationsAssignment_3");
			builder.put(grammarAccess.getImplementationDetailAccess().getClassTestCaseRelationsAssignment_8(), "rule__ImplementationDetail__ClassTestCaseRelationsAssignment_8");
			builder.put(grammarAccess.getModuleClassRelationAccess().getModuleAssignment_0(), "rule__ModuleClassRelation__ModuleAssignment_0");
			builder.put(grammarAccess.getModuleClassRelationAccess().getClassesAssignment_4(), "rule__ModuleClassRelation__ClassesAssignment_4");
			builder.put(grammarAccess.getModuleClassRelationAccess().getClassesAssignment_5_1(), "rule__ModuleClassRelation__ClassesAssignment_5_1");
			builder.put(grammarAccess.getClassTestCaseRelationAccess().getClazzAssignment_0(), "rule__ClassTestCaseRelation__ClazzAssignment_0");
			builder.put(grammarAccess.getClassTestCaseRelationAccess().getTestCasesAssignment_4(), "rule__ClassTestCaseRelation__TestCasesAssignment_4");
			builder.put(grammarAccess.getClassTestCaseRelationAccess().getTestCasesAssignment_5_1(), "rule__ClassTestCaseRelation__TestCasesAssignment_5_1");
			builder.put(grammarAccess.getClassDefAccess().getNameAssignment(), "rule__ClassDef__NameAssignment");
		}
	}
	
	@Inject
	private NameMappings nameMappings;

	@Inject
	private SafetyDSLGrammarAccess grammarAccess;

	@Override
	protected InternalSafetyDSLParser createParser() {
		InternalSafetyDSLParser result = new InternalSafetyDSLParser(null);
		result.setGrammarAccess(grammarAccess);
		return result;
	}

	@Override
	protected String getRuleName(AbstractElement element) {
		return nameMappings.getRuleName(element);
	}

	@Override
	protected String[] getInitialHiddenTokens() {
		return new String[] { "RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT" };
	}

	public SafetyDSLGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(SafetyDSLGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
	
	public NameMappings getNameMappings() {
		return nameMappings;
	}
	
	public void setNameMappings(NameMappings nameMappings) {
		this.nameMappings = nameMappings;
	}
}