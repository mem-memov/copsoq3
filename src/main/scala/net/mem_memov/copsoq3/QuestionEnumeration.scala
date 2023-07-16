package net.mem_memov.copsoq3

import net.mem_memov.copsoq3.question

enum QuestionEnumeration(question: Question):
  case QuantitativeDemands1 extends QuestionEnumeration(question.QuantitativeDemands1)
  case QuantitativeDemands2 extends QuestionEnumeration(question.QuantitativeDemands2)
  case QuantitativeDemands3 extends QuestionEnumeration(question.QuantitativeDemands3)
  case QuantitativeDemands4 extends QuestionEnumeration(question.QuantitativeDemands4)
  case WorkPace1 extends QuestionEnumeration(question.WorkPace1)
  case WorkPace2 extends QuestionEnumeration(question.WorkPace2)
  case WorkPace3 extends QuestionEnumeration(question.WorkPace3)
  case EmotionalDemands1 extends QuestionEnumeration(question.EmotionalDemands1)
  case EmotionalDemands2 extends QuestionEnumeration(question.EmotionalDemands2)
  case EmotionalDemands3 extends QuestionEnumeration(question.EmotionalDemands3)
  case DemandsForHidingEmotions1 extends QuestionEnumeration(question.DemandsForHidingEmotions1)
  case DemandsForHidingEmotions2 extends QuestionEnumeration(question.DemandsForHidingEmotions2)
  case DemandsForHidingEmotions3 extends QuestionEnumeration(question.DemandsForHidingEmotions3)
  case DemandsForHidingEmotions4 extends QuestionEnumeration(question.DemandsForHidingEmotions4)
  case InfluenceAtWork1 extends QuestionEnumeration(question.InfluenceAtWork1)
  case InfluenceAtWork2 extends QuestionEnumeration(question.InfluenceAtWork2)
  case InfluenceAtWork3 extends QuestionEnumeration(question.InfluenceAtWork3)
  case InfluenceAtWork4 extends QuestionEnumeration(question.InfluenceAtWork4)
  case InfluenceAtWork5 extends QuestionEnumeration(question.InfluenceAtWork5)
  case InfluenceAtWork6 extends QuestionEnumeration(question.InfluenceAtWork6)
  case PossibilitiesForDevelopment2 extends QuestionEnumeration(question.PossibilitiesForDevelopment2)
  case PossibilitiesForDevelopment3 extends QuestionEnumeration(question.PossibilitiesForDevelopment3)
  case PossibilitiesForDevelopment4 extends QuestionEnumeration(question.PossibilitiesForDevelopment4)
  case VariationOfWork1 extends QuestionEnumeration(question.VariationOfWork1)
  case VariationOfWork2 extends QuestionEnumeration(question.VariationOfWork2)
  case ControlOverWorkingTime1 extends QuestionEnumeration(question.ControlOverWorkingTime1)
  case ControlOverWorkingTime2 extends QuestionEnumeration(question.ControlOverWorkingTime2)
  case ControlOverWorkingTime3 extends QuestionEnumeration(question.ControlOverWorkingTime3)
  case ControlOverWorkingTime4 extends QuestionEnumeration(question.ControlOverWorkingTime4)
  case ControlOverWorkingTime5 extends QuestionEnumeration(question.ControlOverWorkingTime5)
  case MeaningOfWork1 extends QuestionEnumeration(question.MeaningOfWork1)
  case MeaningOfWork2 extends QuestionEnumeration(question.MeaningOfWork2)
  case Predictability1 extends QuestionEnumeration(question.Predictability1)
  case Predictability2 extends QuestionEnumeration(question.Predictability2)
  case Recognition1 extends QuestionEnumeration(question.Recognition1)
  case Recognition2 extends QuestionEnumeration(question.Recognition2)
  case Recognition3 extends QuestionEnumeration(question.Recognition3)
  case RoleClarity1 extends QuestionEnumeration(question.RoleClarity1)
  case RoleClarity2 extends QuestionEnumeration(question.RoleClarity2)
  case RoleClarity3 extends QuestionEnumeration(question.RoleClarity3)
  case RoleConflicts2 extends QuestionEnumeration(question.RoleConflicts2)
  case RoleConflicts3 extends QuestionEnumeration(question.RoleConflicts3)
  case IllegitimateTasks1 extends QuestionEnumeration(question.IllegitimateTasks1)
  case QualityOfLeadership1 extends QuestionEnumeration(question.QualityOfLeadership1)
  case QualityOfLeadership2 extends QuestionEnumeration(question.QualityOfLeadership2)
  case QualityOfLeadership3 extends QuestionEnumeration(question.QualityOfLeadership3)
  case QualityOfLeadership4 extends QuestionEnumeration(question.QualityOfLeadership4)
  case SocialSupportFromSupervisor1 extends QuestionEnumeration(question.SocialSupportFromSupervisor1)
  case SocialSupportFromSupervisor2 extends QuestionEnumeration(question.SocialSupportFromSupervisor2)
  case SocialSupportFromSupervisor3 extends QuestionEnumeration(question.SocialSupportFromSupervisor3)
  case SocialSupportFromColleagues1 extends QuestionEnumeration(question.SocialSupportFromColleagues1)
  case SocialSupportFromColleagues2 extends QuestionEnumeration(question.SocialSupportFromColleagues2)
  case SocialSupportFromColleagues3 extends QuestionEnumeration(question.SocialSupportFromColleagues3)
  case SenseOfCommunityAtWork1 extends QuestionEnumeration(question.SenseOfCommunityAtWork1)
  case SenseOfCommunityAtWork2 extends QuestionEnumeration(question.SenseOfCommunityAtWork2)
  case SenseOfCommunityAtWork3 extends QuestionEnumeration(question.SenseOfCommunityAtWork3)
  case CommitmentToTheWorkplace1 extends QuestionEnumeration(question.CommitmentToTheWorkplace1)
  case CommitmentToTheWorkplace2 extends QuestionEnumeration(question.CommitmentToTheWorkplace2)
  case CommitmentToTheWorkplace3 extends QuestionEnumeration(question.CommitmentToTheWorkplace3)
  case CommitmentToTheWorkplace4 extends QuestionEnumeration(question.CommitmentToTheWorkplace4)
  case CommitmentToTheWorkplace5 extends QuestionEnumeration(question.CommitmentToTheWorkplace5)
  case WorkEngagement1 extends QuestionEnumeration(question.WorkEngagement1)
  case WorkEngagement2 extends QuestionEnumeration(question.WorkEngagement2)
  case WorkEngagement3 extends QuestionEnumeration(question.WorkEngagement3)
  case JobInsecurity1 extends QuestionEnumeration(question.JobInsecurity1)
  case JobInsecurity2 extends QuestionEnumeration(question.JobInsecurity2)
  case JobInsecurity3 extends QuestionEnumeration(question.JobInsecurity3)
  case InsecurityOverWorkingConditions1 extends QuestionEnumeration(question.InsecurityOverWorkingConditions1)
  case InsecurityOverWorkingConditions2 extends QuestionEnumeration(question.InsecurityOverWorkingConditions2)
  case InsecurityOverWorkingConditions3 extends QuestionEnumeration(question.InsecurityOverWorkingConditions3)
  case InsecurityOverWorkingConditions4 extends QuestionEnumeration(question.InsecurityOverWorkingConditions4)
  case InsecurityOverWorkingConditions5 extends QuestionEnumeration(question.InsecurityOverWorkingConditions5)
  case QualityOfWork1 extends QuestionEnumeration(question.QualityOfWork1)
  case QualityOfWork2 extends QuestionEnumeration(question.QualityOfWork2)
  case JobSatisfaction1 extends QuestionEnumeration(question.JobSatisfaction1)
  case JobSatisfaction2 extends QuestionEnumeration(question.JobSatisfaction2)
  case JobSatisfaction3 extends QuestionEnumeration(question.JobSatisfaction3)
  case JobSatisfaction4 extends QuestionEnumeration(question.JobSatisfaction4)
  case JobSatisfaction5 extends QuestionEnumeration(question.JobSatisfaction5)
  case WorkLifeConflict1 extends QuestionEnumeration(question.WorkLifeConflict1)
  case WorkLifeConflict2 extends QuestionEnumeration(question.WorkLifeConflict2)
  case WorkLifeConflict3 extends QuestionEnumeration(question.WorkLifeConflict3)
  case WorkLifeConflict5 extends QuestionEnumeration(question.WorkLifeConflict5)
  case WorkLifeConflict6 extends QuestionEnumeration(question.WorkLifeConflict6)