/*******************************************************************************
 * Copyright 2015-2018 Capgemini SE.
 * 
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 * 
 *      http://www.apache.org/licenses/LICENSE-2.0
 * 
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 ******************************************************************************/
package com.devonfw.starter.winauthsso;

import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.context.annotation.Configuration;

import com.devonfw.module.winauthsso.common.api.WinauthSSO;
import com.devonfw.module.winauthsso.common.impl.security.WinauthSSOImpl;

/**
 * @author vapadwal
 *
 */
@Configuration
@ConditionalOnClass({ WinauthSSO.class, WinauthSSOImpl.class })
public class WinAuthSsoAutoConfiguration {

}
