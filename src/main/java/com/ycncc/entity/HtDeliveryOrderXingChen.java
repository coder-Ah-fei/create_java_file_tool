//package com.ycncc.entity;
//
//import com.ycncc.hangtian.common.enums.DeliveryOrderStatus;
//import com.ycncc.hangtian.entity.basic.BasicEntity;
//import io.swagger.annotations.ApiModel;
//import io.swagger.annotations.ApiModelProperty;
//import lombok.Getter;
//import lombok.Setter;
//import lombok.experimental.Accessors;
//import org.codehaus.jackson.annotate.JsonIgnore;
//
//import javax.persistence.*;
//
///**
// * 职位投递单（星辰英才计划）
// */
//@ApiModel(value = "HtDeliveryOrderXingChen 对象", description = "职位投递单（星辰英才计划）表")
//@Getter
//@Setter
//@Accessors(chain = true)
//@Entity
//@Table(name = "ht_delivery_order_xing_chen")
//@org.hibernate.annotations.Table(appliesTo = "ht_delivery_order_xing_chen", comment = "职位投递单（星辰英才计划）表")
//public class HtDeliveryOrderXingChen extends BasicEntity {
//	private static final long serialVersionUID = 1L;
//
//	/**
//	 * 主键ID
//	 */
//	@Id
//	@ApiModelProperty("主键ID")
//	@Column(name = "delivery_order_xing_chen_id", nullable = false)
//	@GeneratedValue(strategy = GenerationType.IDENTITY)
//	private Long deliveryOrderXingChenId;
//
//
//	@ApiModelProperty("投递单编号")
//	@Column(name = "order_code", columnDefinition = "varchar(150) NULL COMMENT '投递单编号'")
//	private String orderCode;
//
//	/**
//	 * 简历
//	 */
//	@ApiModelProperty("简历")
//	@ManyToOne(optional = true, fetch = FetchType.LAZY)
//	@JoinColumn(name = "resume_id")
//	@JsonIgnore
//	private com.ycncc.hangtian.entity.HtResume htResume;
//
//	/**
//	 * 意向单位1（一级）
//	 */
//	@ApiModelProperty("意向单位1（一级）")
//	@ManyToOne(optional = true, fetch = FetchType.LAZY)
//	@JoinColumn(name = "dept1_id")
//	@JsonIgnore
//	private SysDept sysDept1;
//
//	/**
//	 * 意向单位1（二级）
//	 */
//	@ApiModelProperty("意向单位1（二级）")
//	@ManyToOne(optional = true, fetch = FetchType.LAZY)
//	@JoinColumn(name = "sys_dept1_child_id")
//	@JsonIgnore
//	private SysDept sysDept1Child;
//
//	/**
//	 * 意向单位2（一级）
//	 */
//	@ApiModelProperty("意向单位2（一级）")
//	@ManyToOne(optional = true, fetch = FetchType.LAZY)
//	@JoinColumn(name = "dept2_id")
//	@JsonIgnore
//	private SysDept sysDept2;
//
//	/**
//	 * 意向单位2（二级）
//	 */
//	@ApiModelProperty("意向单位2（二级）")
//	@ManyToOne(optional = true, fetch = FetchType.LAZY)
//	@JoinColumn(name = "sys_dept2_child_id")
//	@JsonIgnore
//	private SysDept sysDept2Child;
//
//	/**
//	 * 意向单位3（一级）
//	 */
//	@ApiModelProperty("意向单位3（一级）")
//	@ManyToOne(optional = true, fetch = FetchType.LAZY)
//	@JoinColumn(name = "dept3_id")
//	@JsonIgnore
//	private SysDept sysDept3;
//
//	/**
//	 * 意向单位3（二级）
//	 */
//	@ApiModelProperty("意向单位1（二级）")
//	@ManyToOne(optional = true, fetch = FetchType.LAZY)
//	@JoinColumn(name = "sys_dept3_child")
//	@JsonIgnore
//	private SysDept sysDept3Child;
//
//
//	@ApiModelProperty("投递单状态")
//	@Column(name = "delivery_order_status", columnDefinition = "varchar(150) NULL COMMENT '投递单状态'")
//	@Enumerated(EnumType.STRING)
//	private DeliveryOrderStatus deliveryOrderStatus;
//}
