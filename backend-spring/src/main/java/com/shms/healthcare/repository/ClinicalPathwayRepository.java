package com.shms.healthcare.repository;

import com.shms.healthcare.entity.ClinicalPathway;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;
import java.util.Optional;

@Repository
public interface ClinicalPathwayRepository extends JpaRepository<ClinicalPathway, Long> {
    List<ClinicalPathway> findByStatus(String status);
    Optional<ClinicalPathway> findByPatientPatientIdAndStatus(Long patientId, String status);
    List<ClinicalPathway> findByCurrentStage(String currentStage);
}