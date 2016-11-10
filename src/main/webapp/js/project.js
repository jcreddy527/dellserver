	angular.module('proapp',[]).controller('proctrl', function($scope,$http) {

		var  uri = 'projects';
		$http({
			method :'GET',
			url : uri,
			}).success(
				function(data){
					if(data){
						console.log(data);
						$scope.projectlist = data.projects;
						}else{
							console.log(data);
							}
				})
	
	$scope.emplist = function(){
		var  uri = 'emplist';
		//alert("enter");
		$http({
			method :'GET',
			url : uri,
			}).success(
				function(data){
					if(data){
						console.log(data);
						$scope.employeelist = data.employees;
						}else{
							console.log(data);
							}
				})
	}

	$scope.tasklist = function(){
		var  uri = 'tasklist/'+$scope.project.proID;
		//alert("enter");
		$http({
			method :'GET',
			url : uri,
			}).success(
				function(data){
					if(data){
						console.log(data);
						$scope.taskslist = data.tasks;
						}else{
							console.log(data);
							}
				})
	}
	$scope.emptask = function(empid){
		var  uri = 'emptasklist/'+empid;
		//alert("enter");
		$http({
			method :'GET',
			url : uri,
			}).success(
				function(data){
					if(data){
						alert(data);
						 $scope.prodata = true;
						$scope.emptaskslist = data.tasks;
						}else{
							console.log(data);
							}
				})
	}
	
	$scope.assigntask = function(){
		var  uri = 'taskUpdate/'+$scope.project.proID+'/'+$scope.task.taskId+'/'+$scope.emp.empid;
		//alert("enter");
		$http({
			method :'GET',
			url : uri,
			}).success(
				function(){
				})
	}

		$scope.prosave = function () {
			formdata = {"proName":$scope.proname}
			alert(formdata);
	//alert(formdata);
				var  uri = 'project';
			$http({
				method :'POST',
				url : uri,
				data : formdata,
				}).success(
						function(){
					});

		}
		
		$scope.taskSave = function () {
			formdata = {"project":
            {
                "proID": $scope.project.proID,
                "proName": $scope.project.proName
            },"tittle":$scope.tittle,"description":$scope.desc,"status":'assigned'}
			alert(JSON.stringify(formdata));
	//alert(formdata);
				var  uri = 'task';
			$http({
				method :'POST',
				url : uri,
				data : formdata,
				}).success(
						function(){
							console.log('data saved success');
					});

		}
		
		$scope.empsave = function () {
			formdata = {"name":$scope.name,"email":$scope.email,"today":$scope.today,"yesterday":$scope.yesterday,"issues":$scope.issues}
			alert(JSON.stringify(formdata));
	//alert(formdata);
				var  uri = 'empsave';
			$http({
				method :'POST',
				url : uri,
				data : formdata,
				}).success(
						function(){
							console.log('data saved success');
					});

		}
	
	
	
	
		});
