package com.luosico.user;


import com.luosico.domain.*;

import java.util.List;

/**
 * dubbo服务调用接口
 *
 * @Author: luo kai fa
 * @Date: 2021/4/26
 */
public interface UserUtil {

    /**
     * 通过用户名查找用户
     *
     * @param username 账号
     * @return 用户信息
     */
    User selectUserByUsername(String username);

    /**
     * 通过手机号码查找用户
     *
     * @param phoneNumber 手机号码
     * @return 用户信息
     */
    User selectUserByPhoneNumber(String phoneNumber);

    /**
     * 通过 username查找 userId
     *
     * @param username 用户名
     * @return
     */
    Integer selectUserIdByUsername(String username);

    /**
     * 新增用户
     *
     * @param user 用户信息
     * @return
     */
    int addUser(User user);

    /**
     * 查找用户名是否存在
     *
     * @param username 用户名
     * @return 存在：1 ; 不存在：0
     */
    int selectProperty(String username, String val);

    /**
     * 更新用户信息
     *
     * @param user 用户信息
     * @return
     */
    int updateUser(User user);

    /**
     * 添加区域
     *
     * @param regionName 区域名称
     * @return 执行结果影响行数
     */
    int addRegion(String regionName);

    /**
     * 更新区域
     *
     * @param region 区域
     * @return
     */
    int updateRegion(Region region);

    /**
     * 删除区域
     *
     * @param regionId
     * @return
     */
    int deleteRegion(Integer regionId);

    /**
     * 查询所有区域
     *
     * @return
     */
    List<Region> selectAllRegion();

    /**
     * 添加地址
     *
     * @param address
     * @return
     */
    int addAddress(Address address);

    /**
     * 更新地址
     */
    int updateAddress(Address address);

    /**
     * 获取用户所有地址
     *
     * @param userId
     * @return
     */
    List<Address> selectAddressesByUserId(Integer userId);

    /**
     * 删除地址
     *
     * @param addressId
     * @return
     */
    int deleteAddress(Integer addressId);

    /**
     * 从数据库中
     * 根据 userId查找手机号码
     *
     * @param userId
     * @return
     */
    String selectPhoneNumber(Integer userId);

    /**
     * 更新用户信息
     *
     * @param username    当前用户名
     * @param newUsername 新的用户名
     * @param name        姓名
     * @return 执行结果
     */
    int updateUserName(String username, String newUsername, String name);

    /**
     * 更新手机号码
     *
     * @param username
     * @param phoneNumber
     * @return
     */
    int updatePhoneNumber(String username, String phoneNumber);

    /**
     * 成为快取员
     *
     * @param courier
     * @return courierId
     */
    int addCourier(Courier courier);

    /**
     * 成为快取员，更新权限
     *
     * @param userId
     * @return
     */
    int updateAuthority(Integer userId);

    /**
     * 获取快取员编号
     *
     * @param userId
     * @return
     */
    Integer selectCourierIdByUserId(Integer userId);

    /**
     * 快取员建立钱包
     *
     * @param courierId
     * @return
     */
    boolean createWallet(Integer courierId);

    /**
     * 更新钱包金额
     *
     * @param courierId
     * @param amount
     * @return
     */
    boolean updateWallet(Integer courierId, Integer amount);

    /**
     * 查找钱包余额
     *
     * @param courierId
     * @return
     */
    Integer selectWalletBalance(Integer courierId);

    /**
     * 查询快取员所有订单金额的总和
     *
     * @param courierId
     * @return
     */
    Integer selectTotalBalance(Integer courierId);

    /**
     * 查询所有快递订单的金额总和
     *
     * @return
     */
    Integer selectTotalBalance();

    /**
     * 添加余额变动记录
     *
     * @param record
     * @return
     */
    boolean addBalanceRecord(BalanceRecord record);

    /**
     * 查询余额变动记录
     *
     * @param courierId
     * @return
     */
    List<BalanceRecord> selectBalanceRecord(Integer courierId);

}
