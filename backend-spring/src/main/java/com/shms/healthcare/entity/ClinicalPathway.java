package com.shms.healthcare.entity;

import jakarta.persistence.*;
import lombok.Data;
import java.time.LocalDateTime;

@Entity
@Table(name = "clinical_pathways")
@Data
public class ClinicalPathway {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "pathway_id")
    private Long pathwayId;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "patient_id")
    private Patient patient;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "assigned_doctor_id")
    private Doctor assignedDoctor;

    @Column(name = "current_stage", nullable = false)
    private String currentStage = "Registration";

    private String symptoms;
    private String diagnosis;

    @Column(name = "treatment_plan")
    private String treatmentPlan;

    @Column(nullable = false)
    private String status = "Active";

    @Column(name = "created_at", updatable = false)
    private LocalDateTime createdAt = LocalDateTime.now();

    @Column(name = "updated_at")
    private LocalDateTime updatedAt = LocalDateTime.now();
}