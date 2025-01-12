/*
 * Copyright 2015-2016 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package fork.jp.classmethod.aws.gradle.ec2;

import org.gradle.api.Project;

import com.amazonaws.services.ec2.AmazonEC2Client;

import fork.jp.classmethod.aws.gradle.common.BaseRegionAwarePluginExtension;

public class AmazonEC2PluginExtension extends BaseRegionAwarePluginExtension<AmazonEC2Client> {
	
	public static final String NAME = "ec2";
	
	
	public AmazonEC2PluginExtension(Project project) {
		super(project, AmazonEC2Client.class);
	}
	
}
