 <link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
  <link rel="stylesheet" href="js/style.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
  <script src="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
  <script src="https://ajax.googleapis.com/ajax/libs/angularjs/1.4.3/angular.min.js"></script>
<!--   <base href="/"/>
 -->   <script src="js/angularmodule.js"></script>
  <!--   <script src="/app.js"></script>
      <script src="/employeeservice.js"></script>
      <script src="/employee_controller.js"></script>
       -->
       <script src="js/images.js"></script>
        <script src="js/img.js"></script>
  <body ng-app="myapp" ng-controller="empctrl">

    <nav class="navbar navbar-inverse">
  
      <div class="container">
        <div class="navbar-header">
          <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#navbar" aria-expanded="false" aria-controls="navbar">
            <span class="sr-only">Toggle navigation</span>
            <span class="icon-bar"></span>
            <span class="icon-bar"></span>
            <span class="icon-bar"></span>
          </button>
          <a class="navbar-brand" href="#">Employee Portal</a>
        </div>
        <div id="navbar" class="collapse navbar-collapse">
          <ul class="nav navbar-nav">
            <li class="active"><a href="#">Home</a></li>
            <li><a href="#about">About</a></li>
            <li><a href="#contact">Contact</a></li>
            <li><a href="#prodata" ng-show="profiledata" ng-click="prolist()">Employee List</a></li>
            </ul>
            <ul class="nav navbar-nav navbar-right right-nav">
			  <li><a href="#loginbox" class="modal-toggle" data-toggle="modal">login</a></li>
			  <li><a href="#signupbox" class="modal-toggle" data-toggle="modal">Employee register</a></li>
			</ul>
        </div><!--/.nav-collapse -->
      </div>
    </nav>
    
    <script type="text/javascript" src="http://ajax.googleapis.com/ajax/libs/jquery/1.4.2/jquery.min.js?ver=3.0.1"></script><script type="text/javascript" src="js/infinite-rotator.js"></script>


    <div class="container" ng-show="success">
     <button class="btn btn-success">Employee registered Successfully</button>
     </div>
     
    <div class="container" ng-show="prodata">
    <table class="table table-hover">
		  <tr>
			<th class="success">Id</th>
			<th class="info">Name</th>
			<th class="success">Email</th>
			<th class="info">phone</th>
			<th class="info">Date of Join</th>
			<th class="active">State</th>
			<th class="active">City</th>
			<th class="active">Pincode</th>
			<th class="warning">Departname</th>
		<!-- 	<th class="info">Update</th>
			<th class="danger">Delete</th>
			
			 -->
		  </tr>
		  <tr ng-repeat="x in employees" ng-class-even="'striped'">
		    <td>{{ x.id }}</td>
			<td>{{ x.name }}</td>
			<td>{{ x.email }}</td>
		    <td>{{ x.phone }}</td>
		    <td>{{ x.doj }}</td>
			<td>{{ x.state }}</td>
			<td>{{ x.city }}</td>
			<td>{{ x.pincode }}</td>
			<td>{{ x.deptname }}</td>
		<!-- 	<td>    <a href="" ng-click="edit(x)">update employee</a></td>
			<td>	<a href="" ng-click="delete(x)">delete employee</a></td>
		 -->  </tr>
		</table>
 </div>
  <!-- Modal -->
  <div class="modal fade" id="loginbox" role="dialog">
    <div class="modal-dialog">
    
      <!-- Modal content-->
      <div class="modal-content">
        <div class="modal-header">
             <div class="panel panel-info" >
                    <div class="panel-heading">
                      <button type="button" class="close" data-dismiss="modal" aria-hidden="true">×</button>
                        <div class="panel-title">Sign In</div>
                     </div>  
                        

       <div style="padding-top:30px" class="panel-body" >

                        <div style="display:none" id="login-alert" class="alert alert-danger col-sm-12"></div>
                            
                        <form id="loginform" class="form-horizontal" role="form">
                       
                        
                          <div style="margin-bottom: 10px" class="input-group">
                                         <span style="color: red;" ng-show="error">login credentials are wrong login again</span>
                                    </div>
                                    
                            <div style="margin-bottom: 25px" class="input-group">
                                        <span class="input-group-addon"><i class="glyphicon glyphicon-user"></i></span>
                                        <input id="login-username" type="text" class="form-control" name="username" value="" ng-model="uemail" placeholder="username or email">                                        
                                    </div>
                                
                            <div style="margin-bottom: 25px" class="input-group">
                                        <span class="input-group-addon"><i class="glyphicon glyphicon-lock"></i></span>
                                        <input id="login-password" type="password" class="form-control" name="password" ng-model="upassword" placeholder="password">
                                    </div>
                                    

                                
                            <div class="input-group">
                              
                                <div style="margin-top:10px" class="form-group">
                                    <!-- Button -->

                                    <div class="col-sm-12 controls">
                                      <a id="btn-login" href="#" class="btn btn-success" ng-click="validate()">Login  </a>
                                    </div>
                                </div>

                                <div class="form-group">
                                    <div class="col-md-12 control">
                                        <div style="border-top: 1px solid#888; padding-top:15px; font-size:85%" >
                                            Don't have an account! 
                                        <a href="#signupbox" class="modal-toggle" data-toggle="modal">
                                            Sign Up Here
                                        </a>
                                        </div>
                                       </div>
                                    </div> 
                                </div>    
                            </form>     
                        </div>                     
                    </div>  
	               </div>
	   		   </div>
	    </div>
	</div>
	
 <div class="modal fade" id="signupbox" role="dialog">
 
    <div class="modal-dialog">
    
      <!-- Modal content-->
      <div class="modal-content">
        <div class="modal-header">
           <div class="panel panel-info" >
                    <div class="panel-heading">
                      <button type="button" class="close" data-dismiss="modal" aria-hidden="true">×</button>
                        <div class="panel-title">Sign Up</div>
                     </div>  
                        
          <div style="padding-top:30px" class="panel-body" >

                        <div style="display:none" id="login-alert" class="alert alert-danger col-sm-12"></div>
                            
                        <form id="loginform" class="form-horizontal" role="form">
                                    
                           <div class="form-group">
                                    <label for="name" class="col-md-3 control-label">Name</label>
                                    <div class="col-md-9">
                                        <input type="text" class="form-control" name="firstname" ng-model="name" placeholder="Name">
                                    </div>
                                </div>
                                <div class="form-group">
                                    <label for="email" class="col-md-3 control-label">Email</label>
                                    <div class="col-md-9">
                                        <input type="email" class="form-control" name="email" ng-model="email" placeholder="Email">
                                    </div>
                                </div>
                                <div class="form-group">
                                    <label for="password" class="col-md-3 control-label">Password</label>
                                    <div class="col-md-9">
                                        <input type="password" class="form-control" name="password" ng-model="pwd" placeholder="Password">
                                    </div>
                                </div>

                                <div class="form-group">
                                    <label for="phone" class="col-md-3 control-label">Contact</label>
                                    <div class="col-md-9">
                                        <input type="number" class="form-control" name="phone" ng-model="phone" placeholder="phone">
                                    </div>
                                </div>
                                
                                <div class="form-group">
                                    <label for="deptname" class="col-md-3 control-label">DeptName</label>
                                    <div class="col-md-9">
                                        <input type="text" class="form-control" name="deptname" ng-model="deptname" placeholder="deptname">
                                    </div>
                                    
                                </div>
                                <div class="form-group">
                                    <label for="state" class="col-md-3 control-label">state</label>
                                    <div class="col-md-9">
                                        <input type="text" class="form-control" name="state" ng-model="state" placeholder="state">
                                    </div>
                                </div>
                                
                                <div class="form-group">
                                    <label for="city" class="col-md-3 control-label">City</label>
                                    <div class="col-md-9">
                                        <input type="text" class="form-control" name="city" ng-model="city" placeholder="city">
                                    </div>
                                </div>
                                                                

                                <div class="form-group">
                                    <label for="pincode" class="col-md-3 control-label">Pincode</label>
                                    <div class="col-md-9">
                                        <input type="number" class="form-control" name="pincode" ng-model="pincode" placeholder="Pincode">
                                    </div>
                                </div>

                                <div class="form-group">
                                    <label for="doj" class="col-md-3 control-label">Date of Birth</label>
                                    <div class="col-md-9">
                                        <input type="date" class="form-control" name="doj" ng-model="doj" placeholder="doj">
                                    </div>
                                </div>
                                                                                                                                                                                      

                                <div class="form-group">
                                    <!-- Button -->                                        
                                    <div class="col-md-offset-3 col-md-9">
                                        <button id="btn-signup" type="button" class="btn btn-info" ng-click="save()" ><i class="icon-hand-right"></i>Sign Up</button>
                                    </div>
                                </div>
                            </form>     
                        </div>                     
                    </div>  
	             </div>   
	            </div>   
     		 </div>
	    </div>
	   <nav class="navbar navbar-inverse navbar-fixed-bottom">
	    <div class=" container panel panel-default">
		  <div class="panel-footer">Copyright © 2016, www.employee.com</div>
		</div>
		</nav>
  </body>