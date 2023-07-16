package net.mem_memov.copsoq3

import net.mem_memov.copsoq3.dimension

enum DimensionEnumeration(dimension: Dimension):
  case QuantitativeDemands extends DimensionEnumeration(dimension.QuantitativeDemands)
  case WorkPace extends DimensionEnumeration(dimension.WorkPace)
  case CognitiveDemands extends DimensionEnumeration(dimension.CognitiveDemands)
  case EmotionalDemands extends DimensionEnumeration(dimension.EmotionalDemands)
  case DemandsForHidingEmotions extends DimensionEnumeration(dimension.DemandsForHidingEmotions)
  case InfluenceAtWork extends DimensionEnumeration(dimension.InfluenceAtWork)
  case PossibilitiesForDevelopment extends DimensionEnumeration(dimension.PossibilitiesForDevelopment)
  case VariationOfWork extends DimensionEnumeration(dimension.VariationOfWork)
  case ControlOverWorkingTime extends DimensionEnumeration(dimension.ControlOverWorkingTime)
  case MeaningOfWork extends DimensionEnumeration(dimension.MeaningOfWork)
  case Predictability extends DimensionEnumeration(dimension.Predictability)
  case Recognition extends DimensionEnumeration(dimension.Recognition)
  case RoleClarity extends DimensionEnumeration(dimension.RoleClarity)
  case RoleConflicts extends DimensionEnumeration(dimension.RoleConflicts)
  case IllegitimateTasks extends DimensionEnumeration(dimension.IllegitimateTasks)
  case QualityOfLeadership extends DimensionEnumeration(dimension.QualityOfLeadership)
  case SocialSupportFromSupervisor extends DimensionEnumeration(dimension.SocialSupportFromSupervisor)
  case SocialSupportFromColleagues extends DimensionEnumeration(dimension.SocialSupportFromColleagues)
  case SenseOfCommunityAtWork extends DimensionEnumeration(dimension.SenseOfCommunityAtWork)
  case CommitmentToTheWorkplace extends DimensionEnumeration(dimension.CommitmentToTheWorkplace)
  case WorkEngagement extends DimensionEnumeration(dimension.WorkEngagement)
  case JobInsecurity extends DimensionEnumeration(dimension.JobInsecurity)
  case InsecurityOverWorkingConditions extends DimensionEnumeration(dimension.InsecurityOverWorkingConditions)
  case QualityOfWork extends DimensionEnumeration(dimension.QualityOfWork)
  case JobSatisfaction extends DimensionEnumeration(dimension.JobSatisfaction)
  case WorkLifeConflict extends DimensionEnumeration(dimension.WorkLifeConflict)
  case HorizontalTrust extends DimensionEnumeration(dimension.HorizontalTrust)
  case VerticalTrust extends DimensionEnumeration(dimension.VerticalTrust)
  case OrganizationalJustice extends DimensionEnumeration(dimension.OrganizationalJustice)
  case GossipAndSlander extends DimensionEnumeration(dimension.GossipAndSlander)
//  case ConflictsAndQuarrels extends DimensionEnumeration("CQ")
//  case UnpleasantTeasing extends DimensionEnumeration("UT")
//  case CyberBullying extends DimensionEnumeration("HSM")
//  case SexualHarassment extends DimensionEnumeration("SH")
//  case ThreatsOfViolence extends DimensionEnumeration("TV")
//  case PhysicalViolence extends DimensionEnumeration("PV")
//  case Bullying extends DimensionEnumeration("BU")
//  case SelfRatedHealth extends DimensionEnumeration("GH")
//  case SleepingTroubles extends DimensionEnumeration("SL")
//  case Burnout extends DimensionEnumeration("BO")
//  case Stress extends DimensionEnumeration("ST")
//  case SomaticStress extends DimensionEnumeration("SO")
//  case CognitiveStress extends DimensionEnumeration("CS")
//  case DepressiveSymptoms extends DimensionEnumeration("DS")
//  case SelfEfficacy extends DimensionEnumeration("SE")