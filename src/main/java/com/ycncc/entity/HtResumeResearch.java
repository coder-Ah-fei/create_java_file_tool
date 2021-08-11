//package com.ycncc.entity;
//
//import com.ycncc.hangtian.entity.basic.BasicEntity;
//import io.swagger.annotations.ApiModel;
//import io.swagger.annotations.ApiModelProperty;
//import lombok.Getter;
//import lombok.Setter;
//import lombok.experimental.Accessors;
//
//import javax.persistence.*;
//import java.time.LocalDate;
//
///**
// * 科研经历
// *
// * @author yang
// */
//@ApiModel(value = "HtResumeResearch 对象", description = "科研经历表")
//@Getter
//@Setter
//@Accessors(chain = true)
//@Entity
//@Table(name = "ht_resume_research")
//@org.hibernate.annotations.Table(appliesTo = "ht_resume_research", comment = "科研经历表")
//public class HtResumeResearch extends BasicEntity {
//	private static final long serialVersionUID = 1L;
//
//	/**
//	 * 主键ID
//	 */
//	@Id
//	@ApiModelProperty("主键ID")
//	@Column(name = "resume_research_id", nullable = false)
//	@GeneratedValue(strategy = GenerationType.IDENTITY)
//	private Long resumeResearchId;
//
//	/**
//	 * 简历
//	 */
//	@ManyToOne
//	@JoinColumn(name = "resume_id")
//	private com.ycncc.hangtian.entity.HtResume htResume;
//
//
//	@ApiModelProperty("项目及承担的主要任务")
//	@Lob
//	@Basic(fetch = FetchType.LAZY)
//	private String researchContent;
//
//
//	/**
//	 * 项目时间
//	 */
//	@ApiModelProperty("项目时间")
//	private LocalDate dateStart;
//	/**
//	 * 项目时间
//	 */
//	@ApiModelProperty("项目时间")
//	private LocalDate dateEnd;
//
//}
