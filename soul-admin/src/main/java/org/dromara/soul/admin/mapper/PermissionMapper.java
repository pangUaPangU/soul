/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.dromara.soul.admin.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.dromara.soul.admin.entity.PermissionDO;
import org.dromara.soul.admin.query.PermissionQuery;

import java.util.List;

/**
 * this is permission mapper.
 *
 * @author nuo-promise
 **/
@Mapper
public interface PermissionMapper {

    /**
     * select permission by id.
     *
     * @param id primary key.
     * @return {@linkplain PermissionDO}
     */
    PermissionDO selectById(String id);

    /**
     * find by Object id.
     *
     * @param objectId role or user id
     * @return {@linkplain List}
     */
    List<PermissionDO> findByObjectId(String objectId);

    /**
     * insert permission.
     *
     * @param userRoleDO {@linkplain PermissionDO}
     * @return rows int
     */
    int insert(PermissionDO userRoleDO);

    /**
     * insert selective permission.
     *
     * @param permissionDO {@linkplain PermissionDO}
     * @return rows int
     */
    int insertSelective(PermissionDO permissionDO);

    /**
     * delete permission.
     *
     * @param id primary key
     * @return rows int
     */
    int delete(String id);

    /**
     * delete permission by object id and resource id.
     *
     * @param permissionQuery permission query info
     * @return rows int
     */
    int deleteByObjectIdAndResourceId(PermissionQuery permissionQuery);
    
    /**
     * delete permission by object id.
     *
     * @param objectId object id
     * @return rows int
     */
    int deleteByObjectIds(List<String> objectId);

    /**
     * list All.
     *
     * @return {@linkplain List}
     */
    List<PermissionDO> selectAll();
}