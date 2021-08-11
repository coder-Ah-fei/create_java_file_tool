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
//
///**
// * 学校表
// */
//@ApiModel(value = "HtSchool 对象", description = "学校表")
//@Getter
//@Setter
//@Accessors(chain = true)
//@Entity
//@Table(name = "ht_school")
//@org.hibernate.annotations.Table(appliesTo = "ht_school", comment = "学校表")
//public class HtSchool extends BasicEntity {
//	private static final long serialVersionUID = 1L;
//
//	/**
//	 * 用户ID
//	 */
//	@Id
//	@ApiModelProperty("专业ID")
//	@Column(name = "school_id", nullable = false)
//	@GeneratedValue(strategy = GenerationType.IDENTITY)
//	private Long schoolId;
//
//	@ApiModelProperty("学校名称")
//	@Column(name = "school_name", columnDefinition = "varchar(150) NOT NULL COMMENT '学校名称'")
//	private String schoolName;
//
//	@ApiModelProperty("学校编号")
//	@Column(name = "school_code", columnDefinition = "varchar(150) NOT NULL COMMENT '学校编号'")
//	private String schoolCode;
//
//	/**
//	 * 显示顺序
//	 */
//	@ApiModelProperty("显示顺序")
//	@Column(name = "order_num", columnDefinition = "int(4) default 0 null comment '显示顺序'")
//	private Integer orderNum;
//
//
//}
