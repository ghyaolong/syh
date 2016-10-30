package com.normal.service;

import org.springframework.stereotype.Service;

import com.normal.dao.LogDao;
import com.normal.dao.MonitorDao;
import com.normal.dao.UserDao;

@Service
public class UserService {
	private LogDao logDao;
	private MonitorDao monitorDao;
	
	private UserDao userDao;
	
	/**
	 * add user
	 */
	public void addUser(){
		logDao.addLog();
		monitorDao.startMonitor();
		
		userDao.addUser();
		
		monitorDao.endMonitor();
		logDao.addLog();
	}
	
	public void delUser(){
		logDao.addLog();
		monitorDao.startMonitor();
		
		userDao.delUser();
		
		monitorDao.endMonitor();
		logDao.addLog();
	}
	
	
}
