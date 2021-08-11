//package com.ycncc.entity;
//
//import com.ycncc.hangtian.common.enums.Education;
//import com.ycncc.hangtian.entity.basic.BasicEntity;
//import io.swagger.annotations.ApiModel;
//import io.swagger.annotations.ApiModelProperty;
//import lombok.Getter;
//import lombok.Setter;
//import lombok.experimental.Accessors;
//import org.hibernate.annotations.Type;
//
//import javax.persistence.*;
//import java.time.LocalDate;
//
///**
// * 教育经历
// *
// * @author yang
// */
//@ApiModel(value = "HtResumeEducation 对象", description = "教育经历表")
//@Getter
//@Setter
//@Accessors(chain = true)
//@Entity
//@Table(name = "ht_resume_education")
//@org.hibernate.annotations.Table(appliesTo = "ht_resume_education", comment = "教育经历表")
//public class HtResumeEducation extends BasicEntity {
//	private static final long serialVersionUID = 1L;
//
//	/**
//	 * 教育经历ID
//	 */
//	@Id
//	@ApiModelProperty("教育经历ID")
//	@Column(name = "resume_education_id", nullable = false)
//	@GeneratedValue(strategy = GenerationType.IDENTITY)
//	private Long resumeEducationId;
//
//	/**
//	 * 简历
//	 */
//	@ManyToOne
//	@JoinColumn(name = "resume_id")
//	private com.ycncc.hangtian.entity.HtResume htResume;
//
//
//	@ApiModelProperty("毕业院校")
//	@Column(name = "school_name", columnDefinition = "varchar(150) NOT NULL COMMENT '毕业院校'")
//	private String schoolName;
//
//	@ApiModelProperty("所学专业")
//	@Column(name = "profession", columnDefinition = "varchar(150) NOT NULL COMMENT '所学专业'")
//	private String profession;
//
//	/**
//	 * 是否保送
//	 */
//	@ApiModelProperty("是否保送")
//	@Type(type = "yes_no")
//	@Column(name = "escort", columnDefinition = "char(1) NULL COMMENT '是否保送'")
//	private boolean escort;
//
//	@ApiModelProperty("学历")
//	@Column(name = "education", columnDefinition = "varchar(150) NOT NULL COMMENT '学历'")
//	@Enumerated(EnumType.STRING)
//	private Education education;
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
