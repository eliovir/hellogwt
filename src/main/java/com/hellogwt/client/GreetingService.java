/**
 * According to GWT RPC rules, let's create service GreetingService annotated with @RemoteServiceRelativePath in com.hellogwt.client package.
 * It will contain only one method greet() that takes and returns a String.
 * Service GreetingService should have a pair - asynchronous service GreetingServiceAsync in the same package.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.hellogwt.client;

import com.google.gwt.user.client.rpc.RemoteService;
import com.google.gwt.user.client.rpc.RemoteServiceRelativePath;

@RemoteServiceRelativePath("springGwtServices/greetingService")
public interface GreetingService extends RemoteService {

    String greet(String name);
}