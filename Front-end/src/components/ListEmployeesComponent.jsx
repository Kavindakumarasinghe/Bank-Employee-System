import React, { Component } from 'react'
import EmployeeService from '../services/EmployeeService'

/*GET the all employees details*/ 

class ListEmployeesComponent extends Component {
    constructor(props) {
        super(props)

        this.state = {
           employees : []
        }
        this.cancel = this.cancel.bind(this);
        
    }

    cancel(){
        this.props.history.push('/home');
    }

    componentDidMount(){
        EmployeeService.getEmployees().then((res) =>{
            this.setState({employees:res.data});
        });
    }
   
    
    render() {
        return (
        <div>
            <div className="row" >
                <table className="table table-striped table-bordered" style={{marginTop:"15pt"}}>
                    <thead className="th">
                        <tr>
                                
                            <th>Employee Name</th>
                            <th>Employee Email</th>
                            <th>Employee Photo</th>
                            <th>Branch Name</th>
                            <th>Bank Name</th>
                            
                        </tr>
                    </thead>

                    <tbody>
                        {
                            this.state.employees.map(
                                employee => 
                                <tr key={employee.id}>
                                    <td>{employee.employeeName}</td>
                                    <td>{employee.employeeEmail}</td>
                                    <td>{employee.employeePhoto}</td>
                                    <td>{employee.branchName}</td>
                                    <td>{employee.bankName}</td>
                                </tr>
                            )
                        }
                    </tbody>

                </table>
            </div>
            <div className="back">
                <button className="btn btn-back" onClick={this.cancel} > Back  </button>
            </div>
        </div>
        )
    }
}
export default ListEmployeesComponent;