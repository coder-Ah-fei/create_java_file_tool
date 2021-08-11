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
// * 工作地点
// *
// * @author yang
// */
//@ApiModel(value = "HtWorkPlace 对象", description = "工作地点表")
//@Getter
//@Setter
//@Accessors(chain = true)
//@Entity
//@Table(name = "ht_work_place")
//@org.hibernate.annotations.Table(appliesTo = "ht_work_place", comment = "工作地点表")
//public class HtWorkPlace extends BasicEntity {
//	private static final long serialVersionUID = 1L;
//
//	/**
//	 * 工作地点ID
//	 */
//	@Id
//	@ApiModelProperty("工作地点ID")
//	@Column(name = "work_place_id", nullable = false)
//	@GeneratedValue(strategy = GenerationType.IDENTITY)
//	private Long workPlaceId;
//
//	@ApiModelProperty("工作地点名称")
//	@Column(name = "work_place_name", columnDefinition = "varchar(150) NOT NULL COMMENT '工作地点名称'")
//	private String workPlaceName;
//
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
