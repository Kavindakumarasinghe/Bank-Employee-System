import React, { Component } from 'react'

/*Home Page of Web System */

export default class MainComponent extends Component {
    
    constructor(props){
        super(props)

        this.viewEmployees = this.viewEmployees.bind(this);
        this.cancel = this.cancel.bind(this);
    }

    viewEmployees(){
        this.props.history.push('/employees');
    }
    cancel(){
        this.props.history.push('/');
    }

    render() {
        return (
            <div>
               <div className="vertical-center">
                    <button className = "btn btn-primary"  style={{alignContent:"center"}} onClick = {this.viewEmployees}> View Employee Details</button>
                    <button className ="btn btn-backToLogin" style={{alignContent:"center"}} onClick = {this.cancel}>Back</button>
               </div> 
            </div>
        )
    }
}
