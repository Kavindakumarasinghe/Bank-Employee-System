import React, { Component } from 'react'

 class LoginComponent extends Component {
    
    constructor(props){
        super(props)
        this.state = this.initialState;
    }

    initialState ={
        employeeEmail:'', employeePassword:''
    };

    credentialChange = event =>{
        this.setState({
            [event.target.name]: event.target.value
        });

    };

    validateUser = () => {
       this.props.history.push('/home');
    };

    resetLogin = () =>{
        this.setState(() => this.initialState);
    };

    render() {
        const {employeeEmail, employeePassword} = this.state;

        return (
        <div className = "container">
            <div className="row"></div>
           
             <div className="card col-md-6 offset-md-3 offset-md-3 mt-5">
                 <h3 className="text-center" style={{fontSize:"22pt",color:"#000080"}}>Login</h3>
                    <div className="card-body mt-4">

                     <form > 
                         <div className="form-group">
                             <label style={{fontSize:"18pt"}}>Email</label>
                             <input style={{fontSize:"14pt"}} placeholder="Email" name="employeeEmail" className="form-control" 
                              value={employeeEmail} onChange={this.credentialChange} />

                         </div>

                         <div className="form-group">
                             <label style={{fontSize:"18pt"}}>Password</label>
                             <input style={{fontSize:"14pt"}} type ="password" placeholder="Password" name="employeePassword" className="form-control" 
                             value={employeePassword} onChange={this.credentialChange} />
                           
                         </div>
                      
                        <button className="btn btn-login" style={{fontSize:"12pt",fontWeight:"bold"}} onClick = {this.validateUser} variant = "success" disabled ={this.state.employeeEmail.length === 0 || this.state.employeePassword.length === 0}>Login</button>
                        <button className="btn btn-reset" style={{fontSize:"11pt",fontWeight:"bold"}} onClick = {this.resetLogin} variant = "info" disabled ={this.state.employeeEmail.length === 0 && this.state.employeePassword.length === 0}>Reset</button>
                    
                     </form>
                    </div>
            </div>
        </div>
       );
    }
}

export default LoginComponent;
