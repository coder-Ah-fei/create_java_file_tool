//package com.ycncc.entity;
//
//import com.ycncc.hangtian.common.enums.ResourceType;
//import com.ycncc.hangtian.entity.basic.BasicEntity;
//import io.swagger.annotations.ApiModelProperty;
//import lombok.Getter;
//import lombok.Setter;
//import lombok.experimental.Accessors;
//
//import javax.persistence.*;
//
///**
// * 资源表
// *
// * @author yangy
// */
//@Getter
//@Setter
//@Accessors(chain = true)
//@Entity
//@Table(name = "sys_resource")
//public class SysResource extends BasicEntity {
//
//	private static final long serialVersionUID = 1L;
//
//	/**
//	 * 参数主键
//	 */
//	@Id
//	@ApiModelProperty("参数主键")
//	@Column(name = "resource_id", nullable = false)
//	@GeneratedValue(strategy = GenerationType.IDENTITY)
//	private Integer resourceId;
//
//	/**
//	 * 文件地址
//	 */
//	@Column(nullable = false)
//	private String resourcePath;
//
//	/**
//	 * 文件名称
//	 */
//	@Column(length = 255)
//	private String fileName;
//
//	/**
//	 *
//	 */
//	private int ordinal;
//
//	/**
//	 * 描述
//	 */
//	private String description;
//
//	/**
//	 * 类型
//	 */
//	@Enumerated(EnumType.STRING)
//	private ResourceType resourceType;
//
//	/**
//	 *
//	 */
//	@Column(length = 100)
//	private String model;
//
//	/**
//	 *
//	 */
//	private int otherId;
//
//	/**
//	 * 文件大小（byte）
//	 */
//	private long size;
//
//}
