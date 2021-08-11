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
// * 职位投递单
// */
//@ApiModel(value = "HtDeliveryOrder 对象", description = "职位投递单表")
//@Getter
//@Setter
//@Accessors(chain = true)
//@Entity
//@Table(name = "ht_delivery_order")
//@org.hibernate.annotations.Table(appliesTo = "ht_delivery_order", comment = "职位投递单表")
//public class HtDeliveryOrder extends BasicEntity {
//	private static final long serialVersionUID = 1L;
//
//	/**
//	 * 主键ID
//	 */
//	@Id
//	@ApiModelProperty("主键ID")
//	@Column(name = "delivery_order_id", nullable = false)
//	@GeneratedValue(strategy = GenerationType.IDENTITY)
//	private Long deliveryOrderId;
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
//	 * 职位
//	 */
//	@ApiModelProperty("职位")
//	@ManyToOne(optional = true, fetch = FetchType.LAZY)
//	@JoinColumn(name = "position_id")
//	@JsonIgnore
//	private HtPosition htPosition;
//
//	@ApiModelProperty("投递单状态")
//	@Column(name = "delivery_order_status", columnDefinition = "varchar(150) NULL COMMENT '投递单状态'")
//	@Enumerated(EnumType.STRING)
//	private DeliveryOrderStatus deliveryOrderStatus;
//}
