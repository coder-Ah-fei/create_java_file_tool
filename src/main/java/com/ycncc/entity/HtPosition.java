//package com.ycncc.entity;
//
//import com.ycncc.hangtian.common.enums.Education;
//import com.ycncc.hangtian.common.enums.JobCategories;
//import com.ycncc.hangtian.common.enums.PositionStatus;
//import com.ycncc.hangtian.common.enums.RecruitmentType;
//import com.ycncc.hangtian.entity.basic.BasicEntity;
//import io.swagger.annotations.ApiModel;
//import io.swagger.annotations.ApiModelProperty;
//import lombok.Getter;
//import lombok.Setter;
//import lombok.experimental.Accessors;
//
//import javax.persistence.*;
//
///**
// * 招聘职位
// *
// * @author yang
// */
//@ApiModel(value = "HtPosition 对象", description = "招聘职位表")
//@Getter
//@Setter
//@Accessors(chain = true)
//@Entity
//@Table(name = "ht_position")
//@org.hibernate.annotations.Table(appliesTo = "ht_position", comment = "招聘职位表")
//public class HtPosition extends BasicEntity {
//	private static final long serialVersionUID = 1L;
//
//	/**
//	 * 主键ID
//	 */
//	@Id
//	@ApiModelProperty("主键ID")
//	@Column(name = "position_id", nullable = false)
//	@GeneratedValue(strategy = GenerationType.IDENTITY)
//	private Long positionId;
//
//
//	@ApiModelProperty("职位名称")
//	@Column(name = "position_name", columnDefinition = "varchar(150)  NULL COMMENT '职位名称'")
//	private String positionName;
//
//
//	/**
//	 * 所属单位
//	 */
//	@ManyToOne
//	@JoinColumn(name = "dept_id")
//	private SysDept sysDept;
//
//	@ApiModelProperty("需求部门")
//	@Column(name = "department_name", columnDefinition = "varchar(150)  NULL COMMENT '需求部门'")
//	private String departmentName;
//
//	/**
//	 * 需求专业(大类)
//	 */
//	@ManyToOne
//	@JoinColumn(name = "main_major_id")
//	private com.ycncc.hangtian.entity.HtMajor mainMajor;
//	/**
//	 * 需求专业(小类)
//	 */
//	@ManyToOne
//	@JoinColumn(name = "main_major_i_id")
//	private com.ycncc.hangtian.entity.HtMajor mainMajorI;
//	/**
//	 * 其他需求专业一(大类)
//	 */
//	@ManyToOne
//	@JoinColumn(name = "other_major1_id")
//	private com.ycncc.hangtian.entity.HtMajor otherMajor1;
//	/**
//	 * 其他需求专业一(小类)
//	 */
//	@ManyToOne
//	@JoinColumn(name = "other_major1_i_id")
//	private com.ycncc.hangtian.entity.HtMajor otherMajor1I;
//	/**
//	 * 其他需求专业二(大类)
//	 */
//	@ManyToOne
//	@JoinColumn(name = "other_major2_id")
//	private com.ycncc.hangtian.entity.HtMajor otherMajor2;
//	/**
//	 * 其他需求专业二(小类)
//	 */
//	@ManyToOne
//	@JoinColumn(name = "other_major2_i_id")
//	private com.ycncc.hangtian.entity.HtMajor otherMajor2I;
//
//
//	@ApiModelProperty("最低学历要求")
//	@Column(name = "education", columnDefinition = "varchar(150) NULL COMMENT '最低学历要求'")
//	@Enumerated(EnumType.STRING)
//	private Education education;
//
//	/**
//	 * 需求人数
//	 */
//	@Column(name = "people_num", columnDefinition = "int(4) default 0 null COMMENT '需求人数'")
//	private Integer peopleNum;
//
//	/**
//	 * 工作地点
//	 */
//	@ManyToOne
//	@JoinColumn(name = "work_place_id")
//	private HtWorkPlace htWorkPlace;
//
//	@ApiModelProperty("岗位类别")
//	@Column(name = "job_categories", columnDefinition = "varchar(150) NULL COMMENT '岗位类别'")
//	@Enumerated(EnumType.STRING)
//	private JobCategories jobCategories;
//
//	@ApiModelProperty("招聘类型")
//	@Column(name = "recruitment_type", columnDefinition = "varchar(150) NULL COMMENT '招聘类型'")
//	@Enumerated(EnumType.STRING)
//	private RecruitmentType recruitmentType;
//
//
//	/**
//	 * 职位描述
//	 */
//	@ApiModelProperty("职位描述")
//	@Lob
//	@Basic(fetch = FetchType.LAZY)
//	private String positionContent;
//	/**
//	 * 特殊需求
//	 */
//	@ApiModelProperty("特殊需求")
//	@Lob
//	@Basic(fetch = FetchType.LAZY)
//	private String otherContent;
//
//	@ApiModelProperty("职位状态")
//	@Column(name = "position_status", columnDefinition = "varchar(150) NULL COMMENT '职位状态'")
//	@Enumerated(EnumType.STRING)
//	private PositionStatus positionStatus;
//}
