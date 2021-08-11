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
// * 工作经历
// *
// * @author yang
// */
//@ApiModel(value = "HtResumeWork 对象", description = "工作经历表")
//@Getter
//@Setter
//@Accessors(chain = true)
//@Entity
//@Table(name = "ht_resume_work")
//@org.hibernate.annotations.Table(appliesTo = "ht_resume_work", comment = "工作经历表")
//public class HtResumeWork extends BasicEntity {
//	private static final long serialVersionUID = 1L;
//
//	/**
//	 * 主键ID
//	 */
//	@Id
//	@ApiModelProperty("主键ID")
//	@Column(name = "resume_work_id", nullable = false)
//	@GeneratedValue(strategy = GenerationType.IDENTITY)
//	private Long resumeWorkId;
//
//	/**
//	 * 简历
//	 */
//	@ManyToOne
//	@JoinColumn(name = "resume_id")
//	private com.ycncc.hangtian.entity.HtResume htResume;
//
//
//	@ApiModelProperty("工作单位")
//	@Column(name = "company_name", columnDefinition = "varchar(150) NOT NULL COMMENT '工作单位'")
//	private String companyName;
//
//	@ApiModelProperty("工作岗位及主要业绩")
//	@Lob
//	@Basic(fetch = FetchType.LAZY)
//	private String workContent;
//
//	/**
//	 * 教育时间
//	 */
//	@ApiModelProperty("教育时间")
//	private LocalDate dateStart;
//	/**
//	 * 教育时间
//	 */
//	@ApiModelProperty("教育时间")
//	private LocalDate dateEnd;
//
//}
