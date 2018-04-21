package com.kaishengit.tms.service;

import com.github.pagehelper.PageInfo;
import com.kaishengit.tms.entity.TicketInRecord;
import com.kaishengit.tms.exception.ServiceException;

/**
 * 年票业务类
 * @author fankay
 */
public interface TicketService {
    /**
     * 保存一个入库记录
     * @param ticketInRecord
     */
    void saveTicketInRecord(TicketInRecord ticketInRecord);

    /**
     * 根据当前页号查询入库记录列表
     * @param pageNo
     * @return
     */
    PageInfo<TicketInRecord> findTicketRecordByPageNo(Integer pageNo);

    /**
     * 根据ID删除年票入库记录
     * @param id
     * @throws ServiceException 删除失败时抛出业务异常
     */
    void delInRecordById(Integer id) throws ServiceException;
}