	angular.module('myapp',[]).controller('empctrl', function($scope,$http) {

	 $scope.prolist = function(){
		 $scope.image = true;
		 $scope.success = false;
		var uri = 'employees';
		$http({
			method :'GET',
			url : uri
			}).success(function(data) {
				
				
			$scope.employees=data.empList;
			$scope.prodata = true;
			}).error(function(){
				alert("error to fetch data");
				});
	} 
		$scope.validate = function(){
			 $scope.image = true;
			$scope.success = false;

			formdata = {"email":$scope.uemail,"pwd":$scope.upassword}
		//	alert(formdata);
						var  uri = 'employeevalidate';
					$http({
						method :'POST',
						url : uri,
						data : formdata,
						}).success(
							function(data){
								if(data){

									angular.element('#loginbox').modal('hide');
									$scope.profiledata = true;
									
									
									console.log("display");
									
									}else{
										console.log(data);
										$scope.error = !data;
										}
							});
		}
		$scope.save = function () {
			 $scope.image = true;
			$scope.success = false;

			formdata = {"name":$scope.name,"email":$scope.email,"pwd":$scope.pwd,"phone":$scope.phone,"doj":$scope.doj,"deptname":$scope.deptname,"city":$scope.city,"state":$scope.state,"pincode":$scope.pincode}
	//alert(formdata);
				var  uri = 'employees';
			$http({
				method :'POST',
				url : uri,
				data : formdata,
				}).success(
						function(){
					$scope.success = true;
					angular.element('#signupbox').modal('hide'); 
					angular.element('#loginbox').modal('hide');
						
						});

		}

		$scope.delete=function(x){
			 $scope.image = true;
			formdata =  {"id":x.id,"name":x.name,"email":x.email,"pwd":x.pwd,"phone":x.phone,"doj":x.doj,"deptname":x.deptname,"city":x.city,"state":x.state,"pincode":x.pincode}
			
						var  uri = 'employees/'+x.id;
			alert(uri);
					$http({
						method :'DELETE',
						url : uri,
					//	data : formdata,
						}).success(
					
								function() {
							alert("data deleted successfylly");
						});
		}
	});
