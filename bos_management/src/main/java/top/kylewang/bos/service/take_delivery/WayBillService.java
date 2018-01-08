package top.kylewang.bos.service.take_delivery;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import top.kylewang.bos.domain.take_delivery.WayBill; /**
 * @author Kyle.Wang
 * 2018/1/8 0008 15:13
 */
public interface WayBillService {

    /**
     * 保存运单
     * @param model
     */
    void save(WayBill model);

    /**
     * 分页查询
     * @param pageable
     * @return
     */
    Page<WayBill> findPageData(Pageable pageable);
}