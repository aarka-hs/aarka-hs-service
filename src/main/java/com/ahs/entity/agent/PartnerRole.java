package com.ahs.entity.agent;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "partner_role")
public class PartnerRole {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name="pin")
    private String pin;

    @Column(name="status")
    private char status; // A, I, B

    @Column(name="created_by")
    private String createdBy;

    @Column(name="updated_by")
    private String updateBy;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "partner_id")
    private Partner partner;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "role_id")
    private AgentRoles agentRole;

}
