package cn.bugstack.middleware.dynamic.thread.pool.sdk.registry;

import cn.bugstack.middleware.dynamic.thread.pool.sdk.domain.model.entity.ThreadPoolConfigEntity;

import java.util.List;

/**
 * @author: Xuyifeng
 * @date: 2025/1/13 11:30
 * @description: 注册中心接口
 */

public interface IRegistry {

    void reportThreadPool(List<ThreadPoolConfigEntity> threadPoolEntities);

    void reportThreadPoolConfigParameter(ThreadPoolConfigEntity threadPoolConfigEntity);

}
