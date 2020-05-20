package com.graduationProject.mapper;

import java.util.List;

import com.graduationProject.pojo.Users;
import com.graduationProject.pojo.vo.FriendRequestVO;
import com.graduationProject.pojo.vo.MyFriendsVO;
import com.graduationProject.utils.MyMapper;

public interface UsersMapperCustom extends MyMapper<Users> {
	
	public List<FriendRequestVO> queryFriendRequestList(String acceptUserId);
	
	public List<MyFriendsVO> queryMyFriends(String userId);
	
	public void batchUpdateMsgSigned(List<String> msgIdList);
	
}