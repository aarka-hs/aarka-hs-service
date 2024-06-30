package com.ahs.entity.agent;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "agent_roles")
public class AgentRoles {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name="role_code")
    private String roleCode;

    @Column(name="role_desc")
    private String roleDesc;

    @Column(name="status")
    private char status; // A, I, B

    @Column(name="created_by")
    private String createdBy;

    @Column(name="updated_by")
    private String updateBy;

}
