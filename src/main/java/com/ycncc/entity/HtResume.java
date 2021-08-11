//package com.ycncc.entity;
//
//import com.ycncc.hangtian.common.enums.Education;
//import com.ycncc.hangtian.common.enums.JobCategories;
//import com.ycncc.hangtian.common.enums.PoliticalStatus;
//import com.ycncc.hangtian.entity.basic.BasicEntity;
//import io.swagger.annotations.ApiModel;
//import io.swagger.annotations.ApiModelProperty;
//import lombok.Getter;
//import lombok.Setter;
//import lombok.experimental.Accessors;
//import org.codehaus.jackson.annotate.JsonIgnore;
//import org.hibernate.annotations.Type;
//
//import javax.persistence.*;
//import java.util.ArrayList;
//import java.util.List;
//
///**
// * 简历
// *
// * @author yang
// */
//@ApiModel(value = "HtResume 对象", description = "简历表")
//@Getter
//@Setter
//@Accessors(chain = true)
//@Entity
//@Table(name = "ht_resume")
//@org.hibernate.annotations.Table(appliesTo = "ht_resume", comment = "简历表")
//public class HtResume extends BasicEntity {
//	private static final long serialVersionUID = 1L;
//
//	/**
//	 * 简历ID
//	 */
//	@Id
//	@ApiModelProperty("简历ID")
//	@Column(name = "resume_id", nullable = false)
//	@GeneratedValue(strategy = GenerationType.IDENTITY)
//	private Long resumeId;
//
//	/**
//	 * 所属用户
//	 */
//	@OneToOne
//	@JoinColumn(name = "user_id", nullable = true)
//	private HtUser htUser;
//
//
//	@ApiModelProperty("生源地")
//	@Column(name = "birthplace", columnDefinition = "varchar(150) NOT NULL COMMENT '生源地'")
//	private String birthplace;
//
//
//	@ApiModelProperty("最高学历")
//	@Column(name = "education", columnDefinition = "varchar(150) NOT NULL COMMENT '最高学历'")
//	@Enumerated(EnumType.STRING)
//	private Education education;
//
//	@ApiModelProperty("政治面貌")
//	@Column(name = "political_status", columnDefinition = "varchar(150) NOT NULL COMMENT '政治面貌'")
//	@Enumerated(EnumType.STRING)
//	private PoliticalStatus politicalStatus;
//
//	/**
//	 * 班级排名
//	 */
//	@ApiModelProperty("班级排名")
//	@Column(name = "class_order", columnDefinition = "varchar(10) NOT NULL COMMENT '班级排名'")
//	private String classOrder;
//
//	/**
//	 * 兴趣爱好
//	 */
//	@ApiModelProperty("兴趣爱好")
//	@Lob
//	@Basic(fetch = FetchType.LAZY)
//	private String hobby;
//
//	/**
//	 * 研究方向
//	 */
//	@ApiModelProperty("研究方向")
//	@Lob
//	@Basic(fetch = FetchType.LAZY)
//	private String researchDirection;
//
//
//	/**
//	 * 研究内容
//	 */
//	@ApiModelProperty("研究内容")
//	@Lob
//	@Basic(fetch = FetchType.LAZY)
//	private String researchContent;
//
//
//	/**
//	 * 是否首次参加工作
//	 */
//	@ApiModelProperty("是否首次参加工作")
//	@Type(type = "yes_no")
//	@Column(name = "first_work", columnDefinition = "char(1) NULL COMMENT '是否首次参加工作'")
//	private boolean firstWork;
//
//	/**
//	 * 自我评价
//	 */
//	@ApiModelProperty("自我评价")
//	@Lob
//	@Basic(fetch = FetchType.LAZY)
//	private String selfEvaluation;
//
//
//	/**
//	 * 求职意向工作地点
//	 */
//	@ManyToMany()
//	@JoinTable(name = "ht_resume_work_place", joinColumns = {@JoinColumn(name = "resume_id")}, inverseJoinColumns = {@JoinColumn(name = "work_place_id")})
//	@JsonIgnore
//	private List<HtWorkPlace> intentWorkPlaces = new ArrayList<>();
//
//	@ApiModelProperty("意向工作类别")
//	@Column(name = "intent_job_categories", columnDefinition = "varchar(150) NOT NULL COMMENT '意向工作类别'")
//	@Enumerated(EnumType.STRING)
//	private JobCategories intentJobCategories;
//
//
//	/**
//	 * 毕业院校
//	 */
//	@ApiModelProperty("毕业院校")
//	@ManyToOne(optional = true, fetch = FetchType.LAZY)
//	@JoinColumn(name = "school_id")
//	@org.codehaus.jackson.annotate.JsonIgnore
//	private HtSchool htSchool;
//
//	/**
//	 * 专业类别
//	 */
//	@ApiModelProperty("专业类别")
//	@ManyToOne(optional = true, fetch = FetchType.LAZY)
//	@JoinColumn(name = "htMajor_i_id")
//	@org.codehaus.jackson.annotate.JsonIgnore
//	private HtMajor htMajorI;
//
//	/**
//	 * 专业名称
//	 */
//	@ApiModelProperty("专业名称")
//	@ManyToOne(optional = true, fetch = FetchType.LAZY)
//	@JoinColumn(name = "htMajor_ii_id")
//	@org.codehaus.jackson.annotate.JsonIgnore
//	private HtMajor htMajorII;
//
//
//	/**
//	 * 显示顺序
//	 */
//	@ApiModelProperty("显示顺序")
//	@Column(name = "order_num", columnDefinition = "int(4) default 0 null comment '显示顺序'")
//	private Integer orderNum;
//
//	/**
//	 * 简历照片
//	 */
//	@ManyToOne
//	@JoinColumn(name = "photo_id")
//	private SysResource photo;
//
//	/**
//	 * 系统生成的简历pdf文件
//	 */
//	@ManyToOne
//	@JoinColumn(name = "pdf_id")
//	private SysResource pdf;
//
//
//	/**
//	 * 用户导入的简历附件
//	 */
//	@ManyToOne
//	@JoinColumn(name = "annex_id")
//	private SysResource annex;
//}
