//package com.ycncc.entity;
//
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
//
///**
// * 专业表
// */
//@ApiModel(value = "Major对象", description = "专业表")
//@Getter
//@Setter
//@Accessors(chain = true)
//@Entity
//@Table(name = "ht_major")
//@org.hibernate.annotations.Table(appliesTo = "ht_major", comment = "专业表")
//public class HtMajor extends BasicEntity {
//	private static final long serialVersionUID = 1L;
//
//	/**
//	 * 用户ID
//	 */
//	@Id
//	@ApiModelProperty("专业ID")
//	@Column(name = "major_id", nullable = false)
//	@GeneratedValue(strategy = GenerationType.IDENTITY)
//	private Long majorId;
//
//	@ApiModelProperty("专业名称")
//	@Column(name = "major_name", columnDefinition = "varchar(150) NOT NULL COMMENT '专业名称'")
//	private String majorName;
//
//	@ApiModelProperty("专业编号")
//	@Column(name = "major_code", columnDefinition = "varchar(150) NOT NULL COMMENT '专业编号'")
//	private String majorCode;
//
//	/**
//	 * 显示顺序
//	 */
//	@ApiModelProperty("显示顺序")
//	@Column(name = "order_num", columnDefinition = "int(4) default 0 null comment '显示顺序'")
//	private Integer orderNum;
//
//	/**
//	 * 专业等级（1级专业2级专业等，区分专业上下级关系）
//	 */
//	@ApiModelProperty("专业等级")
//	@Column(name = "level", columnDefinition = "int(4) default 0 null comment '专业等级（1级专业2级专业等，区分专业上下级关系）'")
//	private Integer level;
//
//	/**
//	 * 上级专业ID
//	 */
//	@ApiModelProperty("上级专业ID")
//	@ManyToOne(optional = true, fetch = FetchType.LAZY)
//	@JoinColumn(name = "parent_id")
//	@JsonIgnore
//	private HtMajor parentMajor;
//
//
//	/**
//	 * 是否星辰英才计划
//	 */
//	@ApiModelProperty("是否星辰英才计划")
//	@Type(type = "yes_no")
//	@Column(name = "xing_chen_ying_cai", columnDefinition = "char(1) NULL COMMENT '是否星辰英才计划'")
//	private boolean xingChenYingCai;
//
//}
