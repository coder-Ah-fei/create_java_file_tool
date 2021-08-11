//package com.ycncc.entity;
//
//import com.ycncc.hangtian.common.enums.SubscribeScene;
//import com.ycncc.hangtian.entity.basic.BasicUser;
//import io.swagger.annotations.ApiModel;
//import io.swagger.annotations.ApiModelProperty;
//import lombok.Getter;
//import lombok.Setter;
//import lombok.experimental.Accessors;
//
//import javax.persistence.*;
//import java.time.LocalDateTime;
//import java.util.Date;
//
///**
// * 用户表
// *
// * @author yang
// */
//@ApiModel(value = "HtUser 对象", description = "用户表")
//@Getter
//@Setter
//@Accessors(chain = true)
//@Entity
//@Table(name = "ht_user")
//@org.hibernate.annotations.Table(appliesTo = "ht_user", comment = "用户表")
//public class HtUser extends BasicUser {
//	private static final long serialVersionUID = 1L;
//	/**
//	 * 用户ID
//	 */
//	@Id
//	@ApiModelProperty("用户ID")
//	@Column(name = "user_id", nullable = false)
//	@GeneratedValue(strategy = GenerationType.IDENTITY)
//	private Long userId;
//
//	/**
//	 * 与简历的关系
//	 */
//	@OneToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "htUser")
//	private com.ycncc.hangtian.entity.HtResume htResume;
//
//
//	/**
//	 * 用户姓名
//	 */
//	@Column(name = "real_name", columnDefinition = "varchar(45) NULL COMMENT '用户姓名'")
//	private String realName;
//
//	/**
//	 * 婚否
//	 */
//	@Column(name = "marry", columnDefinition = "varchar(10) NULL COMMENT '婚否（0：否，1：是，2：保密）'")
//	private String marry;
//
//
//	/**
//	 * 上级用户的openid
//	 */
//	@Column(name = "superior_openid", columnDefinition = "varchar(150) NULL COMMENT '上级用户的openid'")
//	private String superiorOpenid;
//
//
//	/**
//	 * 生日
//	 */
//	private LocalDateTime birthday;
//
//	//---------------------微信相关参数---------------------
//	/**
//	 * 用户是否订阅该公众号标识，值为0时，代表此用户没有关注该公众号，拉取不到其余信息。
//	 */
//	private int subscribe;
//	/**
//	 * 手机号
//	 */
//	@Column(length = 50)
//	private String mobilePhone;
//
//	/**
//	 * 微信openid
//	 */
//	@Column(length = 50, unique = true)
//	private String openid;
//
//
//	/**
//	 * 昵称
//	 */
//	private String nickname;
//
//	/**
//	 * 用户的性别，值为1时是男性，值为2时是女性，值为0时是未知
//	 */
//	private int sex;
//
//	/**
//	 * 用户所在城市
//	 */
//	private String city;
//
//	/**
//	 * 用户所在国家
//	 */
//	private String country;
//
//	/**
//	 * 用户所在省份
//	 */
//	private String province;
//
//	/**
//	 * 用户的语言，简体中文为zh_CN
//	 */
//	private String language;
//
//	/**
//	 * 用户头像，最后一个数值代表正方形头像大小（有0、46、64、96、132数值可选，0代表640*640正方形头像），用户没有头像时该项为空。若用户更换头像，原有头像URL将失效。
//	 */
//	private String headimgurl;
//
//	/**
//	 * 用户关注时间，为时间戳。如果用户曾多次关注，则取最后关注时间
//	 */
//	private long subscribeTime;
//	@Temporal(TemporalType.TIMESTAMP)
//	private Date subscribeDate;
//
//	/**
//	 * 公众号运营者对粉丝的备注，公众号运营者可在微信公众平台用户管理界面对粉丝添加备注
//	 */
//	private String remark;
//
//	/**
//	 * 用户所在的分组ID（兼容旧的用户分组接口）
//	 */
//	private int groupid;
//
//	/**
//	 * 用户被打上的标签ID列表
//	 */
//	private String tagidList;
//
//	/**
//	 * 返回用户关注的渠道来源
//	 */
//	@Enumerated(EnumType.STRING)
//	private SubscribeScene subscribeScene;
//
//	/**
//	 * 二维码扫码场景（开发者自定义）
//	 */
//	private String qrScene;
//	/**
//	 * 二维码扫码场景描述（开发者自定义）
//	 */
//	private String qrSceneStr;
//
//
////	/**
////	 * 用户所属的微信分组
////	 */
////	@ManyToOne(optional = true, fetch = FetchType.LAZY)
////	@JoinColumn(name = "wechatUserTagId")
////	private WechatUserTag wechatUserTag;
//
//	//---------------------微信相关参数---------------------
//
//
//}
