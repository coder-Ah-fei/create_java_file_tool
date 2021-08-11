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
// * 荣誉奖励
// *
// * @author yang
// */
//@ApiModel(value = "HtResumeHonor 对象", description = "荣誉奖励表")
//@Getter
//@Setter
//@Accessors(chain = true)
//@Entity
//@Table(name = "ht_resume_honor")
//@org.hibernate.annotations.Table(appliesTo = "ht_resume_honor", comment = "荣誉奖励表")
//public class HtResumeHonor extends BasicEntity {
//	private static final long serialVersionUID = 1L;
//
//	/**
//	 * 主键ID
//	 */
//	@Id
//	@ApiModelProperty("主键ID")
//	@Column(name = "resume_honor_id", nullable = false)
//	@GeneratedValue(strategy = GenerationType.IDENTITY)
//	private Long resumeHonorId;
//
//	/**
//	 * 简历
//	 */
//	@ManyToOne
//	@JoinColumn(name = "resume_id")
//	private HtResume htResume;
//
//	@ApiModelProperty("荣誉奖励")
//	@Column(name = "honor_content", columnDefinition = "varchar(150) NOT NULL COMMENT '荣誉奖励'")
//	private String honorContent;
//
//	/**
//	 * 获得时间
//	 */
//	@ApiModelProperty("获得时间")
//	private LocalDate getDate;
//
//}
